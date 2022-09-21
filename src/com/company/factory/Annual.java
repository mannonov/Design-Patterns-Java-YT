package com.company.factory;

public class Annual implements Member {
    @Override
    public void register() {
        System.out.println("Registration started with Annual user");
    }
}
