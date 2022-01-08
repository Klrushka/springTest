package com.example.springtest.test.xml;

import com.example.springtest.models.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestDependencyInjection {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("person", Person.class);

        person.callYourPet();

        context.close();


    }
}
