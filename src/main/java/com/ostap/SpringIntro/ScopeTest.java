package com.ostap.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext3.xml");
        Pet dog = context.getBean("dog", Pet.class);

        dog.say();




//        Pet dog1 = context.getBean("dog", Pet.class);
//        System.out.println(dog == dog1);
//        System.out.println(dog);
//        System.out.println(dog1);
        context.close();
    }
}
