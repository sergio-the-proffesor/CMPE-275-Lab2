package com.example.demo.Service;

import com.example.demo.Model.Reservation;
import com.example.demo.Repository.ReservationRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    //get reservation by number
    public ResponseEntity<?> getReservation(String reservationNumber){
        Reservation reservation = reservationRepository.findByReservationNumber(reservationNumber);
//        return  reservation;
        if(reservation == null){
            return new ResponseEntity<>(errorMessage("BadRequest", "404", "Reservation with number " + reservationNumber + " does not exist ")
            , HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(successMessage(reservation), HttpStatus.OK);
        }

    }

    //To generate error messages
    public String errorMessage(String header, String code, String msg) {
        JSONObject result = new JSONObject();
        JSONObject error = new JSONObject();

        try {
            result.put(header,error);
            error.put("code",code);
            error.put("msg", msg);
        } catch (Exception e) {
            System.out.println("error message catch");
        }

        return result.toString();
    }

    public String successMessage(Reservation reservation){
        JSONObject result = new JSONObject();
        String reservationNumber = reservation.getReservationNumber();
        String origin = reservation.getOrigin();
        String destination = reservation.getDestination();
        int price = reservation.getPrice();

        try {
            result.put("reservationNumber", reservationNumber);
            result.put("origin", origin);
            result.put("destination", destination);
            result.put("price", price);
        } catch (Exception e) {
            System.out.println("error message catch");
        }
        return result.toString();
    }

}
