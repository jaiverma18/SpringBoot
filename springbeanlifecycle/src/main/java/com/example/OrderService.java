package com.example;

import org.springframework.stereotype.Component;

// @Component 
public class OrderService {
    private PaymentService paymentService;
    OrderService(PaymentService paymentservice)
    {
        this.paymentService=paymentservice;
    }
    public void placeOrder(){
        System.out.println("Order placed successfully");
        paymentService.pay();
    }
}
