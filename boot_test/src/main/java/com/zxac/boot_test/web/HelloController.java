package com.zxac.boot_test.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${czx.name}")
    private String name;

    @GetMapping("hello")
    public String hello () {
        return "hello: " + name;
    }

}
