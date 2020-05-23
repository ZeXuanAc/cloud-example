package com.zxac.boot_test.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("cache")
@RestController
@Slf4j
public class SpringCacheTestController {

    @Cacheable(value = "user", key = "#root.method.name + #p0")
    @GetMapping("getUserInfo")
    public String getUserInfo (Integer id) {

        log.info("start getUserInfo id : {}", id);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "get user info success: " + id;
    }

}
