package com.airtribe.ridewise.service;

import com.airtribe.ridewise.model.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverService {

    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(String name, String location) {

        drivers.add(new Driver(name, location));
    }

    public List<Driver> getAvailableDrivers() {

        return drivers.stream()
                .filter(Driver::isAvailable)
                .collect(Collectors.toList());
    }
}
