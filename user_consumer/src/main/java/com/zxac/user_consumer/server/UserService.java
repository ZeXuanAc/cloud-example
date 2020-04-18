package com.zxac.user_consumer.server;

import com.zxac.user_consumer.server.impl.UserServiceFailureCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-provider", fallback = UserServiceFailureCallback.class)
@Repository
public interface UserService {

    @GetMapping("user_login")
    boolean login(@RequestParam("name") String name, @RequestParam("password") String password);

}
