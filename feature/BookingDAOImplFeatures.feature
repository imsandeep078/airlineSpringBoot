Feature: Test the functionality of booking

@Book
Scenario: Booking of flight
	Given Open browser 
	When Fill all details in it 
	Then Book Your Flight 
	
@Cancel
Scenario: Cancellation of booking
	Given Open browser 
	When Fill all details in it 
	Then Cancel it
	
@Delete
Scenario: Deletion of booking
	Given Open browser 
	When Fill all details in it 
	Then Delete booking
	
@GetBooking
Scenario: Get Booking Details
	Given Open browser 
	When Fill all details in it 
	Then Get all your booking details



	
    