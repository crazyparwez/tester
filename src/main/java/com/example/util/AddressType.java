package com.example.util;

public enum AddressType {
    TEMPORARY("T"),
    PERMANENT("p");

    private final String type;

    AddressType(String type) {
        this.type=type;
    }

    public String getAddressType(){
        return this.type;
    }
}
