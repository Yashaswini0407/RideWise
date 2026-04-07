package com.airtribe.ridewise.model;

public class FareReceipt {

    private double baseFare;
    private double tax;
    private double totalFare;

    public FareReceipt(double baseFare, double tax) {

        this.baseFare = baseFare;
        this.tax = tax;
        this.totalFare = baseFare + tax;
    }

    public double getTotalFare() {
        return totalFare;
    }
}
