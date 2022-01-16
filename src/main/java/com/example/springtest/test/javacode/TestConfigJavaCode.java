package com.example.springtest.test.javacode;

import com.example.springtest.models.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestConfigJavaCode {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();

        context.close();
    }
}
