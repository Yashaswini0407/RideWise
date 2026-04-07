package com.airtribe.ridewise.service;

import com.airtribe.ridewise.model.Rider;

import java.util.ArrayList;
import java.util.List;

public class RiderService {

    private List<Rider> riders = new ArrayList<>();

    public Rider addRider(String name) {

        Rider rider = new Rider(name);
        riders.add(rider);

        return rider;
    }
}
