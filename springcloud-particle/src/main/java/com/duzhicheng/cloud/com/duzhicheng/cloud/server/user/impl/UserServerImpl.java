package com.duzhicheng.cloud.com.duzhicheng.cloud.server.user.impl;

import com.duzhicheng.cloud.com.duzhicheng.cloud.dao.user.UserMapper;
import com.duzhicheng.cloud.com.duzhicheng.cloud.server.user.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloudentity.springcloudentity.entity.Achievement;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapeer;

    @Override
    public Person getPerson(String id) {

        return userMapeer.getPerson(id);
    }

    @Override
    public List<Achievement> getAchievement(String id) {
        return userMapeer.getAchievement(id);
    }

    @Override
    public List<Person> selectPerson(String id) {
        return userMapeer.selectPerson(id);
    }

    @Override
    public Person getPerson1(String id) {
        return userMapeer.getPerson1(id);
    }


    @Override
    public List<Person> getPerAndAchList() {

        return userMapeer.getPerAndAchList();
    }


}
