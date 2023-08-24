package com.ostap.SpringIntro;

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

    @Override
    public void say() {
        System.out.println("mew-mew");
    }
}
