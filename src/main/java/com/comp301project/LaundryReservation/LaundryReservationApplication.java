package com.comp301project.LaundryReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.comp301project.FirstThings.FirstThings;
import com.comp301project.database.WriteDefaultData;

@SpringBootApplication
public class LaundryReservationApplication {

	public static void main(String[] args) {
		//WriteDefaultData.getInstance().returnToDefaults();
		FirstThings.handleFirstThings();
		SpringApplication.run(LaundryReservationApplication.class, args);
	}

}