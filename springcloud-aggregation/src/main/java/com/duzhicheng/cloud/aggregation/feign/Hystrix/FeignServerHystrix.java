package com.duzhicheng.cloud.aggregation.feign.Hystrix;

import com.duzhicheng.cloud.aggregation.feign.FeignServer;
import org.springframework.stereotype.Service;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;

@Service
public class FeignServerHystrix implements FeignServer {

    @Override
    public String getPort() {
        return "服务出现故障!请销后再试";
    }

    @Override
    public List<Person> getPerAndAchList(int pageNum, int pageSize) {
        return null;
    }
}
