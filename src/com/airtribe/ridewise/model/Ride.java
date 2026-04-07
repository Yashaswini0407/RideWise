package com.airtribe.ridewise.model;

import com.airtribe.ridewise.util.IdGenerator;

public class Ride {

    private String rideId;
    private Rider rider;
    private Driver driver;
    private String pickup;
    private String drop;
    private RideStatus status;
    private FareReceipt fareReceipt;

    public Ride(Rider rider,
                Driver driver,
                String pickup,
                String drop) {

        this.rideId = IdGenerator.generateRideId();
        this.rider = rider;
        this.driver = driver;
        this.pickup = pickup;
        this.drop = drop;
        this.status = RideStatus.REQUESTED;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setStatus(RideStatus status) {
        this.status = status;
    }

    public void setFareReceipt(FareReceipt receipt) {
        this.fareReceipt = receipt;
    }

    public FareReceipt getFareReceipt() {
        return fareReceipt;
    }

    public String getRideId() {
        return rideId;
    }
}
