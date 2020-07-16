package com.capgemini.airlinereservationsystem.exceptions;

public class AddAirportException extends RuntimeException{
	public AddAirportException() {
		System.out.println("Unable to add airport. Kindly enter valid details.");
	}

}
