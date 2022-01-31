package com.example.springtest.aop.aspects;

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



        System.out.println("beforeAddLogicAdvice: smth add");
    }


}
