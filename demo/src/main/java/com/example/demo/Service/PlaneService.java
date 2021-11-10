package com.example.demo.Service;

import com.example.demo.Model.Plane;
import com.example.demo.Repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneService {
    final PlaneRepository planeRepository;

    @Autowired
    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    // get all Planes
    public Iterable<Plane> getAllPlanes() {
        Iterable<Plane> planes = planeRepository.findAll();
        return planes;
    }
}
