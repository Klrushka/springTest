package com.example.springtest.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Default id = "dog"
@Component("dogBean")
//Default scope = singleton
@Scope
public class Dog implements Pet{
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private int age = 3;

    public Dog() {
        System.out.println("Dog was born\n");
    }

    @Override
    public void voice (){
        System.out.printf("Hi, I'm %s, %d years old\n", name, age);
    }

    @PostConstruct
    public void init(){
        System.out.println("Class dog init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class dog destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
