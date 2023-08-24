package com.ostap.SpringIntro;

public class Person {
    Pet pet;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge");
        this.age = age;
    }

    private String surname;
    private  int age;
//    public Person(Pet pet){
//        this.pet = pet;
//    }


    public Person() {
        System.out.println("Person bean is created");
    }

    public void callYourPet(){
        System.out.println("Come here - " + pet.getName());
        pet.say();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
}
