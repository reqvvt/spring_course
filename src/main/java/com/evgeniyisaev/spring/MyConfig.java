package com.evgeniyisaev.spring;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("myApp.properties")
//@ComponentScan("com.evgeniyisaev.spring")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
