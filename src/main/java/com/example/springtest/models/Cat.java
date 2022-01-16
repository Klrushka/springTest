package com.example.springtest.models;


import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    private String name = "Murka";
    private int age = 2;

    public Cat() {
        System.out.println("Cat was born\n");
    }

    @Override
    public void voice (){
        System.out.printf("Hi, I'm %s, %d years old\n", name, age);
    }

    public void init(){
        System.out.println("Class cat init method");
    }

    public void destroy(){
        System.out.println("Class cat destroy method");
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
