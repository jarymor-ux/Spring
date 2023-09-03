package com.ostap.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: try to keep book");
    }

    // @After("execution(public void get*())")
    // public void afterGetBookAdvice(){
    //     System.out.println("afterGetBookAdvice: try to keep book");
    // }

}
