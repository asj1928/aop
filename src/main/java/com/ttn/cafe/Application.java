package com.ttn.cafe;

import com.ttn.cafe.Combo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main ( String[] args )  {
        ApplicationContext context = new ClassPathXmlApplicationContext ( "config.xml" );
        Combo combo = context.getBean (Combo.class );
        System.out.println ("bisciuts :  "+combo.getBiscuits ().getName () );
        System.out.println ("cake : "+combo.getCake ().getName () );
       try{combo.exception ();}
       catch(Exception e){
       System.out.println(e);
       }
    }
}
