package com.example.springtest.iocdi.models;

//@Component("personBean")
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

    // @Autowired
    // @Autowired can be used to any method
    // @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Pet has been set");
        this.pet = pet;
    }
}
