package com.duzhicheng.cloud.aggregation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudAggregationUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAggregationUserApplication.class, args);
    }

}
