package com.comp301project.LaundryReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.comp301project.FirstThings.FirstThings;

@SpringBootApplication
public class LaundryReservationApplication {

	public static void main(String[] args) {
		FirstThings.handleFirstThings();
		SpringApplication.run(LaundryReservationApplication.class, args);
	}

}