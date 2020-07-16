package com.capgemini.airlinereservationsystem.exceptions;

public class DeleteAirportException extends RuntimeException {
	public DeleteAirportException() {
		System.out.println("SERVER ERROR : Unable to delete airport. Please try again after some time");
	}

}
