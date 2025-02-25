package com.capgemini.airlinereservationsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.airlinereservationsystem.beans.AirlineExecutiveBeans;
import com.capgemini.airlinereservationsystem.beans.FlightInformation;
import com.capgemini.airlinereservationsystem.exceptions.ViewOccupancyException;

@Repository
public class AirlineExecutiveDAOImpl implements AirlineExecutiveDAO {

	@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public AirlineExecutiveBeans viewFlightOccupancy(String flightNumber) throws ViewOccupancyException {
		EntityManager manager = emf.createEntityManager();

		AirlineExecutiveBeans executive = new AirlineExecutiveBeans();

		FlightInformation flightInformation = new FlightInformation();
		flightInformation = manager.find(FlightInformation.class, flightNumber);
		int availableFirstClassSeats = flightInformation.getFirstClassSeats();
		int availableBussinessClassSeats = flightInformation.getBussinessClassSeats();

		String jpql = "select sum(passengers) from FlightBooking where flightNo=:fno and classType='Bussiness'";
		Query query = manager.createQuery(jpql);
		query.setParameter("fno", flightNumber);
		long bookedBussinessClassSeats = (Long) query.getSingleResult();

		String jpql1 = "select sum(passengers) from FlightBooking where flightNo=:fno and classType='First Class'";
		Query query1 = manager.createQuery(jpql1);
		query1.setParameter("fno", flightNumber);
		long bookedFirstClassSeats = (Long) query1.getSingleResult();

		long totalBussinessClassSeats = availableBussinessClassSeats + bookedBussinessClassSeats;
		long totalFirstClassSeats = availableFirstClassSeats + bookedFirstClassSeats;

		long totalSeats = totalBussinessClassSeats + totalFirstClassSeats;

		executive.setFlightNumber(flightNumber);
		executive.setTotalSeats(totalSeats);
		executive.setTotalFirstClassSeats(totalFirstClassSeats);
		executive.setTotalBussinessClassSeats(totalBussinessClassSeats);
		executive.setBookedBussinessClassSeats(bookedBussinessClassSeats);
		executive.setBookedFirstClassSeats(bookedFirstClassSeats);
		executive.setAvailableFirstClassSeats(availableFirstClassSeats);
		executive.setAvailableBussinessClassSeats(availableBussinessClassSeats);
		manager.close();
		return executive;
	}

}
