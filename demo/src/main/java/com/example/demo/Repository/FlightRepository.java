package com.example.demo.Repository;
import com.example.demo.Model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Integer> {

}