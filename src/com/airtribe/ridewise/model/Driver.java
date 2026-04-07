package com.airtribe.ridewise.model;

import com.airtribe.ridewise.util.IdGenerator;

public class Driver {

    private String driverId;
    private String name;
    private boolean isAvailable;
    private int totalTrips;
    private String location;

    public Driver(String name, String location) {
        this.driverId = IdGenerator.generateDriverId();
        this.name = name;
        this.location = location;
        this.isAvailable = true;
        this.totalTrips = 0;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getTotalTrips() {
        return totalTrips;
    }

    public void incrementTrips() {
        totalTrips++;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }
}
