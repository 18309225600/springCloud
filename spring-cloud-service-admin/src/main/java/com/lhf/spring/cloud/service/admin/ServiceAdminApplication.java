package com.lhf.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 16:52
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {

    public static void main(String[] args){
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
