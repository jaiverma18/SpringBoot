package com.example;

// import org.springframework.stereotype.Component;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContextAware;

// @Component
public class userService implements BeanNameAware, ApplicationContextAware {
    public userService(){
        System.out.println("userService constructor called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: " + name);
    }

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) {
        System.out.println("ApplicationContext name is " + applicationContext);
    }
    
}