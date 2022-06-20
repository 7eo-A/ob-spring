package com.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 7eo
 */

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Hello sayHi = (Hello) context.getBean("hello");
        System.out.println(sayHi.hello("Hello World!"));
    }

}
