package com.zxac.user_consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello-consumer")
    public String helloConsumer () {
        return restTemplate.getForObject("http://HELLO-SERVER/hello", String.class);
    }


}
