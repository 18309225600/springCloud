package com.lhf.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class TestConfigController {

    @Value("${foo}")
    private String foo;

    @GetMapping("/hi")
    public String hi(){
        return foo;
    }
}
