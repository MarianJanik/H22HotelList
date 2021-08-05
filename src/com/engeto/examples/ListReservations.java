package com.engeto.examples;

import java.util.ArrayList;

public class ListReservations {
    private ArrayList<Reservation> listReservations = new ArrayList<>();

    public void addReservation(Reservation newReservation){
        listReservations.add(newReservation);
    }

    public void removeReservation(Reservation removeReservation) {
        listReservations.remove(removeReservation);
    }

    public int numberOfReservations(){
        return listReservations.size();
    }

    public void getDescription() {
        System.out.println();
        System.out.println();
        System.out.println("Tisk rezervací: ");
        System.out.println();
        for (Reservation term : listReservations) {
            System.out.println();
            term.getDescriptionGuest();
            System.out.println("od "
                    + MyDate.czechDate(term.getStartDate(), 3) + " do "
                    + MyDate.czechDate(term.getEndDate(), 2)
                    + ", pokoj č." + term.getRoom().getRoomNumber()
                    + ", pobyt " + term.stay.toString()+".");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("\n\n");
        System.out.println("------------------ konec tisku ------------------");
        System.out.println();
    }
}
