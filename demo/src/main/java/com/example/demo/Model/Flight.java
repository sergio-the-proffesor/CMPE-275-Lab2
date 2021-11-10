package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Flight {
    @Id
    private String flightNumber;
    private int  price;
    private String origin;
    private String destination;
    private Date departureTime;
    private Date arrivalTime;
    private int seatsLeft;
    private String description;
//    private Plane plane;
//    private List<Passenger> passengers;

    public void Flight() {
    }

//    public Plane getPlane() {
//        return plane;
//    }
//    public void setPlane(Plane plane) {
//        this.plane = plane;
//    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Date getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    public Date getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public int getSeatsLeft() {
        return seatsLeft;
    }
    public void setSeatsLeft(int seatsLeft) {
        this.seatsLeft = seatsLeft;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
//    public List<Passenger> getPassengers() {
//        return passengers;
//    }
//    public void setPassengers(List<Passenger> passengers) {
//        this.passengers = passengers;
//    }

}
