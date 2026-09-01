package com.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class paymentservicecard implements paymentService{
    @Override
 public void pay(){
        System.out.println("Payment Done via card");
    }
    
}
