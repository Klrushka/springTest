package com.example.springtest.aop.aspects;

import com.example.springtest.aop.models.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* return*())")
    private void allReturnMethods(){}

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Pointcut("allReturnMethods() || allGetMethods()")
    private void allGetAndReturnsLogic(){}

    @Pointcut("execution(void add*(..))")
    private void allAddMethods(){}


    @Before("allGetMethods()")
    public void beforeGetLogicAdvice(){
        System.out.println("beforeGetLogic: #1");
    }


    @Before("allReturnMethods()")
    public void beforeReturnLogicAdvice(){
        System.out.println("beforeReturnLogic: #2");
    }


    @Before("allGetAndReturnsLogic()")
    public void beforeReturnAndGetLogicAdvice(){
        System.out.println("beforeReturnAndGetLogicAdvice: #3");
    }

    @Before("allAddMethods()")
    public void beforeAddLogicAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod: " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType: " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName: " + methodSignature.getName());



        if (methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();

            for (Object obj: args){
                if (obj instanceof Book){
                    Book book = (Book) obj;

                    System.out.println("book name: " + book.getName() + "\n" + "book author: " + book.getAuthor() + "\n" +
                            "book date: " + book.getDate());
                } else if (obj instanceof String){
                    System.out.println("Who is added: " + obj);
                }
            }
        }

        System.out.println("beforeAddLogicAdvice: smth add");
    }


}
