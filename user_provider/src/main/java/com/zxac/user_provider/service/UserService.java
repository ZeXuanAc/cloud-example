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

    @GetMapping("random_num")
    public String randomNum(){
        try {
            // 模拟默认超时时间为2000ms，超过2000ms时触发降级
            long time = (long)(Math.random() * 4000);
            Thread.sleep(time);
            log.info("休眠：{} ms", time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "1";
    }

}
