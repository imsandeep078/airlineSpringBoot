package com.capgemini.airlinereservationsystem.exceptions;

public class AddFlightException extends RuntimeException{
	
	public AddFlightException() {
		System.out.println("SERVER ERROR : Unable to add flight. Please try again after some time");
	}

}
