package com.ostap.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();


        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
