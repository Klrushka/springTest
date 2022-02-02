package com.example.springtest.iocdi.test.xml;

import com.example.springtest.iocdi.models.Dog;
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
