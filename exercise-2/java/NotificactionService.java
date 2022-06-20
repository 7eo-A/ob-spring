package com.code;

import org.springframework.stereotype.Component;

@Component
public class NotificactionService {

    /**
     *
     * @param message: a simple message to display in the output
     * @return message
     */
    public String sayHi(String message) {
        return message;
    }

}
