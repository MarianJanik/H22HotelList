package com.engeto.examples;

import java.math.BigDecimal;

public class HotelRoom {
    int roomNumber;
    int numberOfBeds;
    boolean balcony;
    boolean seaView;
    BigDecimal price;

    public HotelRoom(int roomNumber, int numberOfBeds, boolean balcony, boolean seaView, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.price = price;
    }

    public HotelRoom(int roomNumber, int numberOfBeds, boolean balcony, boolean seaView) {
        this(roomNumber, numberOfBeds, balcony, seaView, BigDecimal.valueOf(0));
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
