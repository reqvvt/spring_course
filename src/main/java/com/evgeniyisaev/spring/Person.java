package com.evgeniyisaev.spring;

public class Person {
    private Pet pet;
    private String name;
    private int age;

    //    public Person(Pet pet) {
//        System.out.println("Person is created!");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person is created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class Person: setName");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge");
        this.age = age;
    }
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello! My lovely!");
        pet.say();
    }
}
