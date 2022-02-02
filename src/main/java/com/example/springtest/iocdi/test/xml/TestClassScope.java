package com.example.springtest.iocdi.test.xml;

import com.example.springtest.iocdi.models.Dog;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestClassScope {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextWithAnnotation.xml");


        Dog dog1 = context.getBean("dogBean", Dog.class);

        Dog dog2 = context.getBean("dogBean", Dog.class);


        System.out.println("Dog1: " + dog1  + "\n" + "Dog2: " + dog2 + "\n" + "result: " + (dog1 == dog2));


        context.close();

    }
}
