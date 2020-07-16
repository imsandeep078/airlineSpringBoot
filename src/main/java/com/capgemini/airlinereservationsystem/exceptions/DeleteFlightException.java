package com.capgemini.airlinereservationsystem.exceptions;

public class DeleteFlightException extends RuntimeException {

	public DeleteFlightException() {
		System.out.println("SERVER ERROR : Unable to delete flight. Please try again after some time");
	}
}
