package com.example.springtest.test.xml;


import com.example.springtest.models.Dog;
import com.example.springtest.models.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextWithAnnotation.xml");


        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();

        context.close();
    }
}
