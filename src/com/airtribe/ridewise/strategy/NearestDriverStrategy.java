package com.airtribe.ridewise.strategy;

import com.airtribe.ridewise.model.Driver;

import java.util.List;

public class NearestDriverStrategy implements RideMatchingStrategy {

    @Override
    public Driver matchDriver(List<Driver> drivers) {

        return drivers.stream()
                .filter(Driver::isAvailable)
                .findFirst()
                .orElse(null);
    }
}
