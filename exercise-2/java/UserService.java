package com.code;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificactionService notification;

    public UserService(NotificactionService notification) {
        this.notification = notification;
    }

}
