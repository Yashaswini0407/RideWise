package com.airtribe.ridewise.exception;

public class NoDriverAvailableException
        extends RuntimeException {

    public NoDriverAvailableException() {

        super("No drivers available!");
    }
}
