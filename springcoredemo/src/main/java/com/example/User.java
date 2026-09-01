package com.example;

;
public class User {
    private String name;
    private int age;
    
     User(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }
    void print()
    {
        System.out.println(name + " " + age);
    }

    // Getters and setters
}