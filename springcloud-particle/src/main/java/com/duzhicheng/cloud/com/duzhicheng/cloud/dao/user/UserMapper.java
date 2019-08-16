package com.duzhicheng.cloud.com.duzhicheng.cloud.dao.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springcloudentity.springcloudentity.entity.Achievement;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;

@Mapper
public interface UserMapper {
    Person getPerson(@Param("id") String id);

    List<Achievement> getAchievement(@Param("id") String id);

    List<Person> selectPerson(@Param("id") String id);

    Person getPerson1(@Param("id") String id);

    List<Person> getPerAndAchList();
}
