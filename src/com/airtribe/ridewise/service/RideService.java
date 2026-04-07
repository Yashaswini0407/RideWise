package com.airtribe.ridewise.service;

import com.airtribe.ridewise.exception.NoDriverAvailableException;
import com.airtribe.ridewise.model.*;
import com.airtribe.ridewise.strategy.FareStrategy;
import com.airtribe.ridewise.strategy.RideMatchingStrategy;

public class RideService {

    private DriverService driverService;
    private RideMatchingStrategy matchingStrategy;
    private FareStrategy fareStrategy;

    public RideService(DriverService driverService,
                       RideMatchingStrategy matchingStrategy,
                       FareStrategy fareStrategy) {

        this.driverService = driverService;
        this.matchingStrategy = matchingStrategy;
        this.fareStrategy = fareStrategy;
    }

    public Ride requestRide(Rider rider,
                            String pickup,
                            String drop) {

        Driver driver = matchingStrategy.matchDriver(
                driverService.getAvailableDrivers()
        );

        if (driver == null)
            throw new NoDriverAvailableException();

        driver.setAvailable(false);

        Ride ride = new Ride(rider,
                driver,
                pickup,
                drop);

        ride.setStatus(RideStatus.MATCHED);

        System.out.println("Driver assigned: "
                + driver.getName());

        return ride;
    }

    public void startRide(Ride ride) {

        ride.setStatus(RideStatus.STARTED);

        System.out.println("Ride started");
    }

    public void completeRide(Ride ride) {

        ride.setStatus(RideStatus.COMPLETED);

        FareReceipt receipt =
                fareStrategy.calculateFare(ride);

        ride.setFareReceipt(receipt);

        ride.getDriver().incrementTrips();

        ride.getDriver().setAvailable(true);

        System.out.println("Ride completed. Fare: "
                + receipt.getTotalFare());
    }
}
