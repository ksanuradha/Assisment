package com.example.colombo_life.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colombo_life.model.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, String>{

}
