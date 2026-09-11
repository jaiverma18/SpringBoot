package com.example;

import org.springframework.context.annotation.Scope;


// @Component 
@Scope("singleton")
public class orderService {
    public orderService()
    {
        System.out.println("Order Service bean created");
    }

    void placeOrder()
    {
        System.out.println("Order placed successfully");
    }
    
}
