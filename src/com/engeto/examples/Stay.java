package com.engeto.examples;

public enum Stay {  //výčtový typ
    WORKING ("pracovní"),
    RECREATIONAL("rekreační");

    String deskription;

    Stay(String deskription){
        this.deskription = deskription;
    }

    public String toString(){
        return deskription;
    }

}
