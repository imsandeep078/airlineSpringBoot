package com.capgemini.airlinereservationsystem.exceptions;

public class UpdateFlightException extends RuntimeException {
	
	public UpdateFlightException() {
		System.out.println("SERVER ERROR : Unable to update flight. Please try again after some time");
	}
}
