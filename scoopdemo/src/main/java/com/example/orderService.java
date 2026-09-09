package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
