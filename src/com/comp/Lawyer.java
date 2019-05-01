package com.comp;

public class Lawyer extends Employee {
    public Lawyer(int years){
        super(years);
    }
    public Lawyer(){
        super(0);
    }
    @Override
    public int getVacationDays() {
        return super.getVacationDays()+5;
    }
    public String getVacationForm(){
        return "pink";
    }
    public void sue(String target, String reason){
        System.out.println("Suing "+target+" for "+ reason+".");
    }
}
