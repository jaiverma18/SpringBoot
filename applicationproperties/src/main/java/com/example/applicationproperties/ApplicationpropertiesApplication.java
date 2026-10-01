package com.example.applicationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationpropertiesApplication {

	public static void main(String[] args) {
		// ApplicationContext context=
		SpringApplication.run(ApplicationpropertiesApplication.class, args);
		// PaymentGateway paymentgateway=context.getBean(PaymentGateway.class);
		// paymentgateway.setType("paytm");
		// paymentgateway.setRetryCount(5);
		// paymentgateway.print();
		//but instead from here we want to set such value from application.properties folder
	}

}
