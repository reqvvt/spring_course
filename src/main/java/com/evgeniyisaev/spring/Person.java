package com.evgeniyisaev.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created!");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created!");
        this.pet = pet;
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

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello! My lovely!");
        pet.say();
    }
}
