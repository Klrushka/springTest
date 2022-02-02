package com.example.springtest.aop.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Anton",2, 4);
        Student st2 = new Student("Valentina",1, 7);
        Student st3 = new Student("Boris",3, 6);

        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents(){
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }
}
