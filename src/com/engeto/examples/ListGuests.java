package com.engeto.examples;

import java.util.ArrayList;

public class ListGuests {

    private ArrayList<Guest> listGuests = new ArrayList<>();

    public void addGuest(Guest newGuest){
        listGuests.add(newGuest);
    }

    public Guest getGuests(int number) {
        return listGuests.get(number);
    }

    public void removeGuest(Guest removeGuest) {
        listGuests.remove(removeGuest);
    }

    public int numberOfGuets(){
        return listGuests.size();
    }

    public void printGuest(Guest printGuest){
        System.out.println(printGuest.getName()+" "+printGuest.getSurname()+", "
                +MyDate.czechDate(printGuest.getBirthDate(),2));
    }

    public void getDescription(){
        System.out.println();
        System.out.println();
        System.out.println("-------- Počet hostů - "+this.numberOfGuets()+":");
        System.out.println();
        for (Guest person:listGuests){
            System.out.println(person.getName()+" "+person.getSurname()+", "
                    +MyDate.czechDate(person.getBirthDate(),2));
        }
        System.out.println("-------------------------");
    }

}
