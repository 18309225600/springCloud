package com.lhf.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 17:43
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
public class WebAdminFeignApplication {

    public static void main(String[] args){
        SpringApplication.run(WebAdminFeignApplication.class,args);
    }
}
