package com.duzhicheng.cloud.aggregation.cloud;

import com.duzhicheng.cloud.aggregation.feign.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloudentity.springcloudentity.entity.Person;

import javax.ws.rs.GET;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private FeignServer feignServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getPort")
    public String getPort() {

        return  "我是聚合层 ， 我的端口是 ："+port+"------调用"+feignServer.getPort();
    }

    @GetMapping("/getPerAndAchList")
    public List<Person> getPerAndAchList(int pageNum , int pageSize){

        return feignServer.getPerAndAchList(pageNum,pageSize);
    }

}
