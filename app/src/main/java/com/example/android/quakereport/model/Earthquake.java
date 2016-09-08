package com.example.android.quakereport.model;

/**
 * Describe earthquake object that retrieved from JSON
 */
public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMilliseconds;
    private String url;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {

        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getUrl() {
        return url;
    }
}