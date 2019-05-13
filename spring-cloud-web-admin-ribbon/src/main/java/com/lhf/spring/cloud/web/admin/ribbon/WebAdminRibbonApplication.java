package com.lhf.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 17:09
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class WebAdminRibbonApplication {

    public static void main(String[] args){
        SpringApplication.run(WebAdminRibbonApplication.class,args);
    }
}
