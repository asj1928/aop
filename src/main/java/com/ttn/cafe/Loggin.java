package com.ttn.cafe;

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

}

//package com.spring;
//
//
//        import org.aspectj.lang.JoinPoint;
//        import org.aspectj.lang.annotation.*;
//question1
//@Aspect
//public class AOPAspect{
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
//    @Pointcut("execution(public String getName())")
//    public void joinmethods(){}
//}

//question2

//@Aspect
//public class AOPAspect{
//    @Around("execution(public String getName())")
//
//    public void LoggingAdvice()
//    {
//        System.out.println("I am running before getter method");
//    }
//
//}
//question3
//@Aspect
//public class AOPAspect{
//    @AfterThrowing("args(name)")
//    public void LoggingAdvice(String name)
//    {
//        System.out.println("exception is thrown");
//    }
//
//}
//question4
//@Aspect
//public class AOPAspect{
//
//}
//question5
//@Aspect
//public class AOPAspect{
//@After("execution(public String getName())")
//    public void LoggingAdvice()
//{
//    System.out.println("I am in execution");
//}
//    @Before("execution(public String getName())")
//    public void LoggingAdvice1()
//    {
//        System.out.println("I am in execution");
//    }
//    @After("within(com.spring.Circle)")
//    public void LoggingAdvice2()
//    {
//        System.out.println("I am in execution");
//    }
//    @Before("within(com.spring.Circle)")
//    public void LoggingAdvice3()
//    {
//        System.out.println("I am in execution");
//    }
//    @Before("args(String)")
//    public void LoggingAdvice4()
//    {
//        System.out.println("I take string argument");
//    }
//    @AfterReturning("args(name)")
//    public void givename(String name){
//    System.out.println("this method takes argument as"+name);
//    }
//}
//question7
//public class AOPAspect{
//    @Before("joinmethods()")
//    public void LoggingAdvice(JoinPoint joinPoint)
//    {
//        System.out.println(joinPoint.getTarget());
//        Circle circle=(Circle)joinPoint.getTarget();
//    }
    //    @Before("joinmethods()")
//    public void LoggingAdvice1()
//    {
//        System.out.println("I am running twice");
//    }
//    @Pointcut("execution(public String getName())")
//    public void joinmethods(){}
//}