package com.company.factory;

public class Truck implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivering with truck");
    }
}
