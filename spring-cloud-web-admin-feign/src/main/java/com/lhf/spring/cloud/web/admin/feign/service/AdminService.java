package com.lhf.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author lhf
 * @Description
 * @Date 2019/5/13 18:03
 * @Version 1.0
 **/
@FeignClient(value = "spring-cloud-service-admin")
public interface AdminService {

    @GetMapping("/admin/hi")
    String sayHi(@RequestParam("message") String message);
}
