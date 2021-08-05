package com.engeto.examples;

import java.time.LocalDate;

// My date for print:
// switch1=1 - "1. 1. 2020"
// switch1=2 - "1.1.2020"
// switch1=else(3) - "1.1."

public class MyDate {

    public static String czechDate(LocalDate date1,int switch1){
        String date2;
        if (switch1==1){
            date2 = date1.getDayOfMonth()+". "+date1.getMonthValue()+". "+date1.getYear();
        }
        else if (switch1==2){
            date2 = date1.getDayOfMonth()+"."+date1.getMonthValue()+"."+date1.getYear();
        }
        else{
            date2 = date1.getDayOfMonth()+"."+date1.getMonthValue()+".";
        }
        return date2;
    }
}
