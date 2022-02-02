package com.example.springtest.aop;


import com.example.springtest.aop.models.Student;
import com.example.springtest.aop.models.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.rmi.StubNotFoundException;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        University university = context.getBean("university", University.class);

        university.addStudents();

        List<Student> students = university.getStudents();

        System.out.println(students);

        context.close();
    }


}
