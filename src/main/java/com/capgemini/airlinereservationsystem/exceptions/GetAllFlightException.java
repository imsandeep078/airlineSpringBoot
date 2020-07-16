package com.capgemini.airlinereservationsystem.exceptions;

public class GetAllFlightException extends RuntimeException {
	
	public GetAllFlightException() {
		System.out.println("SERVER ERROR : Unable to fetch flight details. Please try again after some time");
	}

}
