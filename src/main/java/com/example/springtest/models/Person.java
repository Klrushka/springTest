package com.example.springtest.models;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }


    public void callYourPet(){
        System.out.println("My pet come to me\n");
        pet.voice();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
