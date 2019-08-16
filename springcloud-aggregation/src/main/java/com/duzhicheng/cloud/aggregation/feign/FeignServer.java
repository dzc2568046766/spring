package com.duzhicheng.cloud.aggregation.feign;

import com.duzhicheng.cloud.aggregation.feign.Hystrix.FeignServerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springcloudentity.springcloudentity.entity.Person;

import java.util.List;

@Service
@FeignClient(value ="particle-user" ,fallback = FeignServerHystrix.class)
public interface FeignServer {

    @GetMapping("/user/getPort")
    public String getPort();

    @GetMapping("/user/getPerAndAchList")
    List<Person> getPerAndAchList(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize")int pageSize);
}
