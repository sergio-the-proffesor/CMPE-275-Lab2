package com.example.demo.Service;

import com.example.demo.Model.Passenger;
import com.example.demo.Repository.PasssengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    final PassengerRepository PassengerRepository;

    @Autowired
    public PassengerService(PassengerRepository PassengerRepository) {
        this.PassengerRepository = PassengerRepository;
    }

    public Iterable<Passengers> getAllPassngers() {
        Iterable<Passengers> Passengers = PassengerRepository.findAll();
        return Passengers;
    }
}
