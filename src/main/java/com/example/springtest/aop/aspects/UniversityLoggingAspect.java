package com.example.springtest.aop.aspects;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice(){
        System.out.println("beforeGetStudentsAdvice: #1");
    }


    @AfterReturning("execution(* getStudents())")
    public void afterReturningGetStudentsAdvice(){
        System.out.println("afterReturningGetStudentsAdvice: #2");
    }


}
