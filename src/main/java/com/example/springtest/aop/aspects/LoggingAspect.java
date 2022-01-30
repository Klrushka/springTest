package com.example.springtest.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    /*
    @Before
    @After
    @AfterReturning
    @Around
     */
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: attempt to get book");
    }


    @Before("execution(public String returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeGetBookAdvice: attempt to return book");
    }
}
