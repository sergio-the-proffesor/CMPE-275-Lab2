package com.example.demo.Model;
import java.util.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @Column(name="PR_KEY", unique=true)
    private String reservationNumber;
    @OneToOne(targetEntity = Passenger.class, cascade = CascadeType.DETACH)
    private Passenger passenger;
    private String origin;
    private String destination;
    private int price;
    @ManyToMany(targetEntity = Flight.class)
    private List<Flight> flights;

    public void Reservation(){

    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Flight> getFlight() {
        return flights;
    }

    public void setFlight(List<Flight> flight) {
        this.flights = flight;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
}
