package com.example.demo.Repository;
import com.example.demo.Model.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    Reservation findByReservationNumber(String reservationNumber);

}
