package com.airtribe.ridewise.strategy;

import com.airtribe.ridewise.model.Driver;

import java.util.Comparator;
import java.util.List;

public class LeastActiveDriverStrategy
        implements RideMatchingStrategy {

    @Override
    public Driver matchDriver(List<Driver> drivers) {

        return drivers.stream()
                .filter(Driver::isAvailable)
                .min(Comparator.comparingInt(
                        Driver::getTotalTrips))
                .orElse(null);
    }
}
