package com.example.springtest.iocdi.test.javacode;

import com.example.springtest.iocdi.models.Pet;
import com.example.springtest.iocdi.models.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestConfigJavaCode {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        Pet pet1 = context.getBean("dogBean", Pet.class);
        Pet pet2 = context.getBean("dogBean", Pet.class);


        Person person = context.getBean("person", Person.class);

        person.callYourPet();

        System.out.println("pet1: " + pet1 + " pet2: " + pet2 );

        context.close();
    }
}
