package com.capgemini.airlinereservationsystem.dao;

public class GenerateBookingId {
	static String generateBookingId(int n) {

		// chose a Character random from this String
		String generateBookingId = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";

		// StringBuilder is fast as compared to StringBuffer.
		// and storage is Heap.
		StringBuilder stringBuilder = new StringBuilder(n);

		for (int i = 0; i < n; i++) {
			// generate a random number between
			// 0 to AlphaNumericString variable length
			int id = (int) (generateBookingId.length() * Math.random());
			// add Character one by one in end of stringBuilder
			stringBuilder.append(generateBookingId.charAt(id));
		}
		return stringBuilder.toString();
	}

}
