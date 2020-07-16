package com.capgemini.airlinereservationsystem.exceptions;

public class GetBookingInfoException extends RuntimeException {

	public GetBookingInfoException() {
		System.out.println("SERVER ERROR : Unable to fetch booking information.");
	}
}
