package com.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Menu {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ATM atm = context.getBean("atmBean", ATM.class);
        atm.start();
    }
}
