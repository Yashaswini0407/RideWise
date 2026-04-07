package com.airtribe.ridewise.strategy;

import com.airtribe.ridewise.model.Driver;

import java.util.List;

public interface RideMatchingStrategy {

    Driver matchDriver(List<Driver> drivers);
}
