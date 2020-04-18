package com.zxac.user_provider.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserService {

    @GetMapping("user_login")
    public boolean login(@RequestParam("name") String name, @RequestParam("password") String password){
        log.info("name: {}, password: {}", name, password);
        return true;
    }

}
