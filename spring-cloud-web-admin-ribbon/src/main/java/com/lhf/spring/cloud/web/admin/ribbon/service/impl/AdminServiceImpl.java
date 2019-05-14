package com.lhf.spring.cloud.web.admin.ribbon.service.impl;

import com.lhf.spring.cloud.web.admin.ribbon.service.AdminService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 17:22
 * @Version 1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message){
        return restTemplate.getForObject("http://spring-cloud-service-admin/admin/hi?message="+message,String.class);
    }

    public String hiError(String message){
        return "Hystrix ribbon message is "+message;
    }
}
