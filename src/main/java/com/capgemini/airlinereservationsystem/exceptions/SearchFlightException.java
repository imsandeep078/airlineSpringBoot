package com.capgemini.airlinereservationsystem.exceptions;

public class SearchFlightException extends RuntimeException {
	
	public SearchFlightException() {
		System.out.println("Invalid Flight number. Kinfly enter valid flight number.");
	}

}
