package com.ostap.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext.xml");
        Pet pet = context.getBean("dog", Pet.class);
        pet.say();

        context.close();
    }
}
