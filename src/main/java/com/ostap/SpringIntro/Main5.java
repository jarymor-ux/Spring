package com.ostap.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext2.xml");
        Dog dog = context.getBean("dog", Dog.class);
        dog.say();
        context.close();

    }
}
