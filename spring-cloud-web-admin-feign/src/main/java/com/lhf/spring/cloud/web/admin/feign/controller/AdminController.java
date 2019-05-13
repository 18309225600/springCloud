package com.lhf.spring.cloud.web.admin.feign.controller;

import com.lhf.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 18:04
 * @Version 1.0
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message){
        return adminService.sayHi(message);
    }
}
