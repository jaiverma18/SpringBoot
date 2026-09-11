package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
                OrderService order=context.getBean(OrderService.class);
                order.placeorder();
                User user=context.getBean(User.class);
                user.print();
                ((AnnotationConfigApplicationContext)context).close();
               
    //    Class<student> c1=student.class;
       //special class which has meta data of student class
    }
    // public class student{̣ 
    //     private String name;
    //     private int age;
    //     student(String name,int age){

    //     }
    //     public void marks(int a,int b)
    //     {

    //     }
    //     public void print()
    //     {

    //     }
    // }
}