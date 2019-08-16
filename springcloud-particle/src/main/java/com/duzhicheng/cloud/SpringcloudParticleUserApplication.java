package com.duzhicheng.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudParticleUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudParticleUserApplication.class, args);
    }

}
