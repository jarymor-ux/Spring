package com.ostap.SpringIntro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
    @PostConstruct
    private void init() {
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    private void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    public void say() {
        System.out.println("bow-wow");
    }
}
