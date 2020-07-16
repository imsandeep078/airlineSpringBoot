package com.capgemini.airlinereservationsystem.exceptions;

public class DeleteBookingException extends RuntimeException {
	
	public DeleteBookingException() {
		System.out.println("SERVER ERROR : Unable to delete flight booking. Please try again after some time");
	}

}
