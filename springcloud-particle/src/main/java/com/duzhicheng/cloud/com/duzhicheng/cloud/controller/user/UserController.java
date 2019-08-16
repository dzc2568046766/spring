package com.duzhicheng.cloud.com.duzhicheng.cloud.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.duzhicheng.cloud.com.duzhicheng.cloud.server.user.UserServer;
import com.duzhicheng.cloud.com.duzhicheng.cloud.server.user.impl.PersonServerThread;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "/user" , produces = "application/json;charset=UTF-8")
public class UserController {

    @Autowired
    private UserServer userServer;

    @Autowired
    private PersonServerThread personServerThread;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getPort")
    public String getPort(){
        return "我是粒子层，我的端口是："+port;
    }

    @GetMapping("/getPerson/{id}")
    public Object getPerson(@PathVariable("id") String id){
        Person person = userServer.getPerson(id);
        return person;
    }

    @GetMapping("/get/{id}")
    public Person getStr(@PathVariable("id") String id) throws ExecutionException, InterruptedException {

        return personServerThread.getPerson(id);
    }

    @GetMapping("/selectPerson/{id}")
    public List<Person> selectPerson(@PathVariable("id") String id){

        return userServer.selectPerson(id);
    }

    @GetMapping("/getPerson1/{id}")
    public Person getPerson1(@PathVariable("id") String id){
        Long start = System.currentTimeMillis();
        Person person = (Person) redisTemplate.opsForHash().get("person", id);
        if(null != person){
            Long end = System.currentTimeMillis();
            System.out.println("使用时间:"+(end-start));
            return person;
        }
        person = userServer.getPerson1(id);
        redisTemplate.opsForHash().put("person",id,person);
        Long end = System.currentTimeMillis();
        System.out.println("使用时间:"+(end-start));
        return person;
    }

    @GetMapping("/getPerAndAchList")
    public List<Person> getPerAndAchList(int pageNum , int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Person> perAndAchList = userServer.getPerAndAchList();
        PageInfo<Person> personPageInfo = new PageInfo<Person>(perAndAchList);
        List<Person> list = personPageInfo.getList();
        return list;
    }
}
