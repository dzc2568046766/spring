package com.duzhicheng.springcloud.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }

}
