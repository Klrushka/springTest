package com.example.springtest.models;

import org.springframework.stereotype.Component;

//Default id = "dog"
@Component("dogBean")
public class Dog implements Pet{
    private String name;
    private int age;

    public Dog() {
        System.out.println("Dog was born\n");
    }

    @Override
    public void voice (){
        System.out.printf("Hi, I'm %s, %d years old\n", name, age);
    }

    public void init(){
        System.out.println("Class dog init method");
    }

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
