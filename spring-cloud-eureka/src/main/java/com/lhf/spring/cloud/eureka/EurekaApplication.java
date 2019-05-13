package com.lhf.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 16:26
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);
    }
}
