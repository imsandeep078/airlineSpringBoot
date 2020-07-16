package com.capgemini.airlinereservationsystem.exceptions;

public class UserLoginException extends RuntimeException {
	public UserLoginException() {
		System.out.println("Invalid Credentials! Kindly enter valid credentials");
	}
}
