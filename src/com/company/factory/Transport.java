package com.company.factory;

public interface Transport {

    public final static int CAR_UNIQUE_ID = 1000;
    public final static int TRUCK_UNIQUE_ID = 1001;
    public final static int SHIP_UNIQUE_ID = 1002;

    abstract public void delivery();

}
