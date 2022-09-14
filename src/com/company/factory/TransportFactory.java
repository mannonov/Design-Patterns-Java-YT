package com.company.factory;

public class TransportFactory {

    public static Transport getInstance(int uniqueId) {
        Transport transport;
        if (uniqueId == Transport.CAR_UNIQUE_ID) {
            transport = new Car();
        } else if (uniqueId == Transport.TRUCK_UNIQUE_ID) {
            transport = new Truck();
        } else if (uniqueId == Transport.SHIP_UNIQUE_ID) {
            transport = new Ship();
        } else {
            transport = new Car();
        }
        return transport;
    }

}
