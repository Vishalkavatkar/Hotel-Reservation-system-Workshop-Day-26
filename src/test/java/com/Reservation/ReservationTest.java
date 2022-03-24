package com.Reservation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Day26.HotelReservation;

import junit.framework.Assert;

public class ReservationTest {

	/**
	 * JUnit Testing purpose
	 */
	@Test
	public void test() {

		HotelReservation.addHotel("Lakewood", 110);
		HotelReservation.addHotel("Bridgewood", 160);
		HotelReservation.addHotel("Ridgewood", 220);
		Assert.assertEquals(3, HotelReservation.countNoOfHotels());
	}

}
