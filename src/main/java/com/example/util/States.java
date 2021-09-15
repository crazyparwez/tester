package com.example.util;

public enum States {
    MAHARASHTRA("Maharashtra"),
    MADHYAPRADESH("MadhyaPradesh"),
    TELANGANA("Telangana");
    private final String states;

    States(String states) {
        this.states=states;
    }

    public String getStates(){
        return this.states;
    }
}
