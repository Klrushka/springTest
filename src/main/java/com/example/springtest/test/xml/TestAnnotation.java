package com.example.springtest.test.xml;


import com.example.springtest.models.Dog;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextWithAnnotation.xml");


        Dog dog = context.getBean("dogBean", Dog.class);

        dog.voice();

        context.close();
    }
}
