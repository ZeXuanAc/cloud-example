package com.zxac.eureka_client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    private DiscoveryClient client;

    @GetMapping("hello")
    public String hello () {
        System.out.println("time: " + System.currentTimeMillis() + " : 提供hello服务");
        return "hello";
    }

}
