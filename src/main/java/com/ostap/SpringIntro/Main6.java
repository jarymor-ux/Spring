package com.ostap.SpringIntro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;


public class Main6 {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());


        person.callYourPet();
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);




        context.close();
    }
}
