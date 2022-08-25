package com.evgeniyisaev.spring;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog is created!");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
