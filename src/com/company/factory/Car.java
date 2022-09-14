package com.company.factory;

public class Car implements Transport {
    @Override
    public void delivery() {
        System.out.println("Delivering with Card");
    }
}
