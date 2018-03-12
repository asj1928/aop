package com.ttn.cafe;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Loggin {
//    @Pointcut("execution( com.ttn.cafe.*. String getName())")
//    public void log1(){
//        System.out.println ("pop" );
//    }

    @Before("joinmethods()")
    public void LoggingAdvice()
    {
        System.out.println("I am running before getter method");
    }
    @Before("joinmethods()")
    public void LoggingAdvice1()
    {
        System.out.println("I am running twice");
    }
    @Pointcut("execution(public String getName())")
    public void joinmethods(){}
//    @Around ( "execute()" )

}

