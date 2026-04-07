package com.airtribe.ridewise.model;

import com.airtribe.ridewise.util.IdGenerator;

public class Rider {

    private String riderId;
    private String name;

    public Rider(String name) {
        this.riderId = IdGenerator.generateRiderId();
        this.name = name;
    }

    public String getRiderId() {
        return riderId;
    }

    public String getName() {
        return name;
    }
}
