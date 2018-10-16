package com.example.colombo_life.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.colombo_life.model.Passenger;
import com.example.colombo_life.model.Reservation;
import com.example.colombo_life.repository.PassengerRepository;
import com.example.colombo_life.repository.ReservationRepository;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@GetMapping("/reservation")
	public List<Reservation> getAllFlightsShedules() {
		return reservationRepository.findAll();
	}
	@PostMapping("/reservation")
	public void createFlightShedule(@RequestBody Reservation reservation) {
	     reservationRepository.save(reservation);
	}
	//private Optional<Reservation> findById;
	
	@PostMapping("/reservation/{reservation_id}/passenger")
	public void bookingFlight(@PathVariable String reservation_id,@RequestBody Passenger passenger) {
		  	reservationRepository.findById(reservation_id).map(reservation -> {
		 		  	passenger.setReservation(reservation);
		 			return passengerRepository.save(passenger);
		 		});	
		 	//passenger.setReservation(findById);
		 	//passengerRepository.save(passenger);
	}
}
/*
return reservationRepository.findById(reservation_id).map(post -> {
	comment.setPost(post);
	return commentRepository.save(comment);
})*/