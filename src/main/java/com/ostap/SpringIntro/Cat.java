package com.ostap.SpringIntro;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    private String name;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
        System.out.println("Cat bean is crated");
    }

    private void init(){
        System.out.println("Class Cat: init method");
    }

    private void destroy(){
        System.out.println("Class Cat: destroy method");
    }

    @Override
    public void say() {
        System.out.println("mew-mew");
    }
}
