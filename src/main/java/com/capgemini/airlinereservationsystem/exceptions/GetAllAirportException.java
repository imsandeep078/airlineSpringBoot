package com.capgemini.airlinereservationsystem.exceptions;

public class GetAllAirportException extends RuntimeException {
	
	public GetAllAirportException() {
		System.out.println("SERVER ERROR : Unable to fetch airport details. Please try again after some time");
	}
}
