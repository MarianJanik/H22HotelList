package com.engeto.examples;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    HotelRoom room;
    Guest guest;
    ArrayList <Guest> guestsOfRoom = new ArrayList<>();
    Stay stay;
    LocalDate startDate;
    LocalDate endDate;

    public Reservation(HotelRoom room, Guest guest,
                       Stay stay, LocalDate startDate, LocalDate endDate) {
        this.room = room;
        this.guest = guest;
        this.stay = stay;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Reservation(HotelRoom room, Guest guest, Stay stay) {
        this(room, guest, stay, LocalDate.now(), LocalDate.now().plusDays(6));
    }

    public void addNewGuest(Guest newGuest){
        guestsOfRoom.add(newGuest);
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest1) {
        this.guest = guest1;
    }

    public Stay getStay() {
        return stay;
    }

    public void setStay(Stay stay) {
        this.stay = stay;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void getDescriptionGuest(){
        for (Guest guest:guestsOfRoom) {
            System.out.println(guest.getName() +" "+ guest.getSurname() + " ("+MyDate.czechDate(guest.getBirthDate(),2)+")");
        }
    }
}
