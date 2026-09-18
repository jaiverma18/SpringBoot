package com.example.applicationproperties;

// import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class PaymentGateway {

    // public PaymentGateway(@Value ("${paymentgateway.type}") String type,@Value ("${paymentgateway.retryCount} ") int retryCount)
    // {
    //     this.type=type;
    //     this.retryCount=retryCount;
    // }
   private PaymentProperties paymentProperties;
   public PaymentGateway(PaymentProperties paymentProperties)
   {
    this.paymentProperties=paymentProperties;
   }
   public String gettype()
   {
    return paymentProperties.getType();
   }
   public int getretrycount()
   {
    return paymentProperties.getRetryCount();
   }
   public Boolean getIsEnabled(){
    return paymentProperties.getEnabled();
   }
   public int getTimeOut()
   {
    return paymentProperties.getTimeOut();
   }
   void print()
   {
        System.out.println(getretrycount());
		System.out.println(gettype());
		System.out.println(getIsEnabled());
		System.out.println(getTimeOut())	;
   }
}