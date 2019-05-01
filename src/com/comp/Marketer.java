package com.comp;

public class Marketer extends Employee {
    public Marketer(int years){
        super(years);
    }
    public Marketer(){
        super(0);
    }
    @Override
    public double getSalary() {
        return super.getSalary()+10000;
    }
    public void advertise(String product){
        System.out.println("Buy "+product+" today!");
    }
}
