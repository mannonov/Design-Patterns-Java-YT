package com.company.factory;

public class LifeTime implements Member {
    @Override
    public void register() {
        System.out.println("Registration started with LifeTime member");
    }
}
