package com.engeto.examples;

import java.util.ArrayList;

public class ListRooms {

    ArrayList <HotelRoom> listRooms = new ArrayList<>();

    public void addRoom(HotelRoom newRoom){
        listRooms.add(newRoom);
    }

    public void removeRoom(HotelRoom removeRoom) {
        listRooms.remove(removeRoom);
    }

    public HotelRoom getRoom (int number) {
        return listRooms.get(number);
    }

    public int numberOfRoom(){
        return listRooms.size();
    }

    public void printRoom(HotelRoom printRoom){
        System.out.println("Pokoj č."+printRoom.getRoomNumber()+":\n- počet lůžek - "+printRoom.getNumberOfBeds()
                +"\n- balkon - "+((printRoom.isBalcony()==true)? "ano":"ne")
                +"\n- výhled na moře - "+((printRoom.isSeaView()==true)? "ano":"ne")
                +"\n- cena - "+printRoom.getPrice()+" Kč");
    }

    public void getDescription(){
        System.out.println();
        System.out.println();
        System.out.println("---- Počet pokojů - "+this.numberOfRoom()+":");
        for (HotelRoom room:listRooms){
            System.out.println();
            System.out.println("Pokoj č."+room.getRoomNumber()+":\n- počet lůžek - "+room.getNumberOfBeds()
                    +"\n- balkon - "+((room.isBalcony()==true)? "ano":"ne")
                    +"\n- výhled na moře - "+((room.isSeaView()==true)? "ano":"ne")
                    +"\n- cena - "+room.getPrice()+" Kč\n----------------------");
        }
    }


}
