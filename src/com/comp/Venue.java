package com.comp;

public abstract class Venue {
    private String name;
    private int capacity;
    public Venue(String nN, int nC){
        name = nN;
        capacity = nC;
    }
    public abstract double getRevenue();
}
