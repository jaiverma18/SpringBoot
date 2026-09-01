package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.payment.paymentService;

@Component
public class OrderService {
    // @Autowired 
     paymentService pay;
    @Autowired
    OrderService(@Qualifier("paymentservicecard") paymentService Pay){
        this.pay=Pay;
    }
    // @Autowired
    // public void setPay(paymentService pay) {
    //     this.pay = pay;
    // }
    void placeorder(){
        pay.pay();
        System.out.println("order placed");
    }
}
