package com.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan 
public class AppConfig {
    @Bean 
    public orderService getOrder(){
        return new orderService();
    }

    @Bean 
    public orderService getOrder2(){
        return new orderService();
    }
}
