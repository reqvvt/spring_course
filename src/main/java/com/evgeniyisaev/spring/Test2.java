package com.evgeniyisaev.spring;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
