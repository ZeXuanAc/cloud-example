package com.zxac.user_consumer.server.impl;

import com.zxac.user_consumer.server.UserService;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceFailureCallback implements UserService {

    @Override
    public boolean login(String name, String password) {
        return false;
    }


}
