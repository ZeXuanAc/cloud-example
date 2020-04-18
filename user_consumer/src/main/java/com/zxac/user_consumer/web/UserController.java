package com.zxac.user_consumer.web;

import com.zxac.user_consumer.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user_login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
        if (userService.login(name, password)) {
            return "success";
        } else {
            return "failure";
        }
    }
}
