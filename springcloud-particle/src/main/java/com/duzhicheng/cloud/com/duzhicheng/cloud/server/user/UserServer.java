package com.duzhicheng.cloud.com.duzhicheng.cloud.server.user;

import org.apache.ibatis.annotations.Param;
import springcloudentity.springcloudentity.entity.Achievement;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;

public interface UserServer {
    Person getPerson(String id);

    List<Achievement> getAchievement(String id);

    List<Person> selectPerson(@Param("id") String id);

    Person getPerson1(@Param("id") String id);

    List<Person> getPerAndAchList();
}
