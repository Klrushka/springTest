package com.example.springtest.test.xml;

import com.example.springtest.models.Dog;
import com.example.springtest.models.Pet;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DestroyInitMethods {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        Dog dog = context.getBean("myPet", Dog.class);

        dog.voice();

        context.close();
    }
}
