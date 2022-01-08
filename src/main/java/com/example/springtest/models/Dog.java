package com.example.springtest.models;

public class Dog implements Pet{
    private String name = "Petr";
    private int age = 22;
/*

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
*/

    @Override
    public void voice (){
        System.out.printf("Hi, I'm %s, %d years old", name, age);
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
