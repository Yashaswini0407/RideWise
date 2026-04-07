package com.airtribe.ridewise.strategy;

import com.airtribe.ridewise.model.FareReceipt;
import com.airtribe.ridewise.model.Ride;

public class PeakHourFareStrategy implements FareStrategy {

    @Override
    public FareReceipt calculateFare(Ride ride) {

        return new FareReceipt(150, 25);
    }
}
