package com.example.backend_springboot.FactoryMethod;

// Concrete Products
public class Dog implements Pet {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
