Feature: Test the functionality of flight

@Search
Scenario: Search for flight
	Given Open browser 
	When Fill all details in it 
	Then Search flight 
	
@Update
Scenario: Update for flight
	Given Open browser 
	When Fill all details in it 
	Then update it
	
@GetAllFlights
Scenario: Get all information for flight
	Given Open browser 
	When Fill all details in it 
	Then Get all flight details
	
@GetFlight
Scenario: Get you flight
	Given Open browser 
	When Fill all details in it 
	Then Get your flight

@GetAirport
Scenario: Choose your station
	Given Open browser 
	When Fill all details in it 
	Then Choose station
	
@Delete
Scenario: Delete for flight
	Given Open browser 
	When Fill all details in it 
	Then Delete flight
	
@Add	
Scenario: Add for flight
	Given Open browser 
	When Fill all details in it 
	Then Add flight

	
    