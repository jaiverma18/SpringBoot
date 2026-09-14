package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component 
public class PaymentService {
    

void pay(){
    System.out.println("Payment was successfully recieved");
}
}
