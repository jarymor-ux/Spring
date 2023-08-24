package com.ostap.SpringIntro;


public class Dog implements Pet{
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

    public void say(){
        System.out.println("bow-wow");
    }
}
