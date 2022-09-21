package com.company.factory;

public class Temporary implements Member {
    @Override
    public void register() {
        System.out.println("Registration started with Temporary member");
    }
}
