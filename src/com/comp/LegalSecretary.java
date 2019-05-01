package com.comp;

public class LegalSecretary extends Secretary {
    public LegalSecretary(int years){
        super(years);
    }
    public LegalSecretary(){
        super(0);
    }
    @Override
    public double getSalary() {
        return super.getSalary()+5000;
    }
    public void writeLegalDoc(String subject){
        System.out.println("Writing a legal document on "+subject+".");
    }
}
