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
//
//    @After ( "joinmethods()" )
//    public void advice(){
//        System.out.println ("pioncuts se hua hai" );
//    }
@Before("joinmethods()")
public void LoggingAdvice(JoinPoint joinPoint)
{
    System.out.println(joinPoint.getTarget());
//    Combo combo=(Combo) joinPoint.getTarget();
}
    //    @Before("joinmethods()")
//    public void LoggingAdvice1()
//    {
//        System.out.println("I am running twice");
//    }

}


