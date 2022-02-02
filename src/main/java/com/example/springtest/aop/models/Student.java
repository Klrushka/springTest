package com.example.springtest.aop.models;

public class Student {
    private String name;
    private int course;
    private int avg;

    public Student(String name, int course, int avg) {
        this.name = name;
        this.course = course;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avg=" + avg +
                '}';
    }
}
