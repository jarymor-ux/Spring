package com.ostap.SpringIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("AppContext.xml");
//        Pet pet = context.getBean("cat", Pet.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getSurname() + " - " + person.getAge());
        person.callYourPet();
        context.close();
    }
}
