package com.ttn.cafe;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Loggin {
//    @Pointcut("execution( com.ttn.cafe.*. String getName())")
//    public void log1(){
//        System.out.println ("pop" );
//    }

//    @Before("joinmethods()")
//    public void LoggingAdvice()
//    {
//        System.out.println("I am running before getter method");
//    }
//    @Before("joinmethods()")
//    public void LoggingAdvice1()
//    {
//        System.out.println("I am running twice");
//    }
    @Pointcut("execution(public String getName())")
    public void joinmethods(){}
//    @Around ( "joinmethods()" )
//    Object adroundAdvice( ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println ("around before" );
//        Object o=proceedingJoinPoint.proceed ();
//        System.out.println ("aroun after" );
//        return o;
//    }

//    @AfterThrowing( pointcut = "execution(public void Exception())",throwing = "e")
//    public void advice(IllegalArgumentException e){
//        System.out.println ("After  Throwing exception" );
//    }
    @Before("within(com.ttn.cafe.*)")
    public void advice(){
        System.out.println("Running before advice");
    }

    @After("execution(public String getName())")
    public void LoggingAdvice()
{
    System.out.println("I am in execution");
}
    @Before("execution(public String getName())")
    public void LoggingAdvice1()
    {
        System.out.println("I am in execution");
    }
    @After("within(com.ttn.cafe.*)")
    public void LoggingAdvice2()
    {
        System.out.println("I am in execution");
    }
    @Before("within(com.ttn.cafe.*)")
    public void LoggingAdvice3()
    {
        System.out.println("I am in execution");
    }
    @Before("args(String)")
    public void LoggingAdvice4()
    {
        System.out.println("I take string argument");
    }
    @AfterReturning("args(name)")
    public void givename(String name){
    System.out.println("this method takes argument as"+name);
    }
}


