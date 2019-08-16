package com.duzhicheng.cloud.com.duzhicheng.cloud.server.user.impl;

import com.alibaba.fastjson.JSONObject;
import com.duzhicheng.cloud.com.duzhicheng.cloud.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloudentity.springcloudentity.entity.Achievement;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;
import java.util.concurrent.*;

@Service
public class PersonServerThread {

    @Autowired
    private UserMapper userMapper;

    ExecutorService executorService = Executors.newFixedThreadPool(5);

    public Person getPerson(String id) throws ExecutionException, InterruptedException {
//        long start = System.currentTimeMillis();
//
//        Callable callable = new Callable() {
//            @Override
//            public Object call() throws Exception {
//                Person person = userMapper.getPerson(id);
//                String s = JSONObject.toJSONString(person);
//                return s;
//            }
//        };
//
//        Callable callable1 = new Callable() {
//            @Override
//            public Object call() throws Exception {
//                List<Achievement> achievement = userMapper.getAchievement(id);
//                String s1 = JSONObject.toJSONString(achievement);
//                return s1;
//            }
//        };
//        FutureTask<String> funcTrue = new FutureTask(callable);
//        FutureTask<String> funcTrue1 = new FutureTask(callable1);
//
//        executorService.submit(funcTrue);
//        executorService.submit(funcTrue1);
//        String s = funcTrue.get();
//        String s1 = funcTrue1.get();
//        long end = System.currentTimeMillis();
//        System.out.println("接口所用时间:"+(end-start));
//        return s+s1;
        return userMapper.getPerson(id);
    }

}
