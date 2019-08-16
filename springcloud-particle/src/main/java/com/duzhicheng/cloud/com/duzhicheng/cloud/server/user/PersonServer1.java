package com.duzhicheng.cloud.com.duzhicheng.cloud.server.user;

import springcloudentity.springcloudentity.entity.Achievement;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;

public interface PersonServer1 {

    Person getPerson(String id);

    List<Achievement> getAchievement(String id);
}
