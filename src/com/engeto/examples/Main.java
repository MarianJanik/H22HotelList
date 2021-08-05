package com.engeto.examples;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

	    ListGuests ourGuests = new ListGuests();

	    Guest jan1 = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));
	    Guest adela1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
		// john Rambo - další testovací osoba
	    Guest john1 = new Guest("John","Rambo", LocalDate.of(1946,7,6));
	    ourGuests.addGuest(jan1);
		ourGuests.addGuest(adela1);
		ourGuests.addGuest(john1);

	    //ourGuests.printGuest(jan1);
		ourGuests.getDescription();


		ListRooms ourRooms = new ListRooms();

		HotelRoom room3 = new HotelRoom(3,3,false,true,BigDecimal.valueOf(2400));
		HotelRoom room1 = new HotelRoom(1,1,true,true, BigDecimal.valueOf(1000));
		HotelRoom room2 = new HotelRoom(2,1,true,true,BigDecimal.valueOf(1000));
		ourRooms.addRoom(room1);
		ourRooms.addRoom(room2);
		ourRooms.addRoom(room3);

		//ourRooms.printRoom(room1);
		ourRooms.getDescription();



		ListReservations ourReservation2021 = new ListReservations();

		Reservation Reservation1 = new Reservation (room1,jan1,Stay.WORKING,
				LocalDate.of(2021,7,19),
				LocalDate.of(2021,7,26));
		Reservation1.addNewGuest(jan1);
		ourReservation2021.addReservation(Reservation1);

		Reservation Reservation2 = new Reservation (room3,jan1, Stay.RECREATIONAL,
				LocalDate.of(2021,9,1),
				LocalDate.of(2021,9,14));
		Reservation2.addNewGuest(jan1);
		Reservation2.addNewGuest(adela1);
		ourReservation2021.addReservation(Reservation2);

		Reservation Reservation3 = new Reservation(room3,jan1, Stay.WORKING);
		Reservation3.addNewGuest(jan1);
		Reservation3.addNewGuest(adela1);
		Reservation3.addNewGuest(john1);
		ourReservation2021.addReservation(Reservation3);

		ourReservation2021.getDescription();
    }
}
