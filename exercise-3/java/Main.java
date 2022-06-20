package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author 7eo
 */

@SpringBootApplication
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        //Add new user
        User tmp = new User(0, "Leo", "123", 1);
        User tmp1 = new User(0, "Alex",  "456", 2);


        UserRepository user = context.getBean(UserRepository.class);
        //Save user - 1
        user.save(tmp);

        //Save user - 2
        user.save(tmp1);

        System.out.println(user.count());

    }

}
