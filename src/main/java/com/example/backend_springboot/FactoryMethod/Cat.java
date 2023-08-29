package com.example.backend_springboot.FactoryMethod;

public class Cat implements Pet {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
