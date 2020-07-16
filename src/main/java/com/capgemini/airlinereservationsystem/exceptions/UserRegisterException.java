package com.capgemini.airlinereservationsystem.exceptions;

public class UserRegisterException extends RuntimeException {
	public UserRegisterException() {
		System.out.println("All fields are required.");
	}
}
