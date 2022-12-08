package com.example.demo.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Aspect
@Component
public class SampleAspect {
//    @Before("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
//    public void beforeAdvice(JoinPoint joinPoint){
//        System.out.println("==== BeforeAdvice ====");
//        System.out.println(new SimpleDateFormat(    "yyyy/MM/dd").format(new java.util.Date()));
//        System.out.println(String.format("메서드 : %s", joinPoint.getSignature().getName()));
//    }
//    @After("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
//    public void afterAdvice(JoinPoint joinPoint){
//        System.out.println("==== AfterAdvice ====");
//        System.out.println(new SimpleDateFormat(    "yyyy/MM/dd").format(new java.util.Date()));
//        System.out.println(String.format("메서드 : %s", joinPoint.getSignature().toShortString()));
//    }
    @Around("execution(* com.example.demo.chapter03.used.Greet.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("==== AroundAdvice ====");
        System.out.println("처리전 <<<");
        Object result = joinPoint.proceed();
        System.out.println("처리후 >>>");
        return result;
    }
}
