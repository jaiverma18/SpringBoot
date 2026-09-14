package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component 
public class OrderService {
    PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed successfully");
    }
}
