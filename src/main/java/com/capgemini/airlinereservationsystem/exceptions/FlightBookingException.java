package com.capgemini.airlinereservationsystem.exceptions;

public class FlightBookingException extends RuntimeException {

	public FlightBookingException() {
		System.out.println("SERVER ERROR : Unable to book flight. Please try again after some time");
	}

}
