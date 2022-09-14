package com.company.factory;

public class Ship implements Transport {
    @Override
    public void delivery() {
        System.out.println("Delivering with ship");
    }
}
