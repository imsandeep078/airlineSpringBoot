package com.capgemini.airlinereservationsystem.exceptions;

public class GetFlightException extends RuntimeException {

	public GetFlightException() {
		System.out.println("Unable to fetch flight details. Kindly check entered flight number.");
	}

}
