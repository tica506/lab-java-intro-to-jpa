package com.example.lab_java_intro_to_jpa.model;
public class Flight {
    private int flightId;
    private String flightNumber;
    private String aircraft;
    private int totalAircraftSeats;
    private int flightMileage;

    // Empty constructor for Hibernate
    public Flight() {
    }

    // Parameterized constructor
    public Flight(String flightNumber, String aircraft, int totalAircraftSeats, int flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }

    // Getter and setter methods
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(int totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public int getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(int flightMileage) {
        this.flightMileage = flightMileage;
    }
}