package com.example.colombo_life.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.colombo_life.model.Flight;
import com.example.colombo_life.repository.FlightRepository;

@RestController
public class FlightController {
	@Autowired
	FlightRepository flightRepository;
	
	@GetMapping("/flight")
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}
	@PostMapping("/flight")
	public Flight createNote(@RequestBody Flight flight) {
	    return flightRepository.save(flight);
	}
}
