package com.airtribe.ridewise.util;

import java.util.UUID;

public class IdGenerator {

    public static String generateRideId() {

        return "RIDE-" +
                UUID.randomUUID()
                        .toString()
                        .substring(0,5);
    }

    public static String generateDriverId() {

        return "DRIVER-" +
                UUID.randomUUID()
                        .toString()
                        .substring(0,5);
    }

    public static String generateRiderId() {

        return "RIDER-" +
                UUID.randomUUID()
                        .toString()
                        .substring(0,5);
    }
}
