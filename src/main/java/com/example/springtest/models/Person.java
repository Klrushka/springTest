package com.example.springtest.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    @Autowired
    private Pet pet;

/*    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }*/


    public void callYourPet(){
        System.out.println("My pet come to me\n");
        pet.voice();
    }

    public Pet getPet() {
        return pet;
    }

/*    @Autowired
    // @Autowired can be used to any method
    public void setPet(Pet pet) {
        System.out.println("Pet has been set");
        this.pet = pet;
    }*/
}
