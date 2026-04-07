package com.airtribe.ridewise;

import com.airtribe.ridewise.model.*;
import com.airtribe.ridewise.service.*;
import com.airtribe.ridewise.strategy.*;

public class Main {

    public static void main(String[] args) {

        RiderService riderService = new RiderService();
        DriverService driverService = new DriverService();

        Rider rider = riderService.addRider("Alice");

        driverService.addDriver("Bob", "LocationA");
        driverService.addDriver("Charlie", "LocationB");

        RideMatchingStrategy matchingStrategy =
                new NearestDriverStrategy();

        FareStrategy fareStrategy =
                new DefaultFareStrategy();

        RideService rideService =
                new RideService(driverService,
                        matchingStrategy,
                        fareStrategy);

        Ride ride = rideService.requestRide(
                rider,
                "Home",
                "Office"
        );

        rideService.startRide(ride);

        rideService.completeRide(ride);
    }
}
