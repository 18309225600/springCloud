package com.lhf.spring.cloud.web.admin.feign.service.hystrix;

import com.lhf.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "feign hystrix , message is "+message;
    }
}
