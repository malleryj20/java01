package com.comp;

public class Secretary extends Employee{
    public Secretary(int years){
        super(years);
    }
    public Secretary(){
        super(0);
    }
    public void takeDictation(String text){
        System.out.println("Taking dictation of text: "+text);
    }
    public int getBonus(){
        return 0;
    }
}
