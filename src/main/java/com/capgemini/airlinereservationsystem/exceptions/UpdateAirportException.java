package com.capgemini.airlinereservationsystem.exceptions;

public class UpdateAirportException extends RuntimeException {
	public UpdateAirportException() {
		System.out.println("SERVER ERROR : Unable to update airport. Please try again after some time");
	}

}
