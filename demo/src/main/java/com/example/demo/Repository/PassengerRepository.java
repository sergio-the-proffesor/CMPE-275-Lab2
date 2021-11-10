package com.example.demo.Repository;

import com.example.demo.Model.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger,Long> {
}
