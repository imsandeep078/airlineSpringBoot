package com.capgemini.airlinereservationsystem.exceptions;

public class ViewOccupancyException extends RuntimeException {
	public ViewOccupancyException() {
		System.out.println("SERVER ERROR : Unable to fetch flight occupancy details. Please try again after some time");
	}

}
