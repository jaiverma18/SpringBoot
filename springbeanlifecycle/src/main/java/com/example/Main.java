package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        
        cartService cartservice=context.getBean(cartService.class);
        String s=cartservice.getCartMap(2);
        System.out.println(s);
        
        ((AnnotationConfigApplicationContext) context).close();
    }
}