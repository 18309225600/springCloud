package com.lhf.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 16:56
 * @Version 1.0
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message){
        return String.format("adminServices message is %s,port is %s",message,port);
    }
}
