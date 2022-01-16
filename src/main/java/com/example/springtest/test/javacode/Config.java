package com.example.springtest.test.javacode;

import com.example.springtest.models.Cat;
import com.example.springtest.models.Dog;
import com.example.springtest.models.Person;
import com.example.springtest.models.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.example.springtest")
public class Config {

    @Bean
    @Scope("prototype")
    // beanId = method name
    public Pet dogBean(){
        return new Dog();
    }


    @Bean
    public Person person(){
        return new Person(dogBean());
    }
}
