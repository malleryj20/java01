package com.comp;

public class auto {
    private String model;
    private double gallons;
    private int miles;

    public auto(String modelName, double gallons){
        model = modelName;
        SetGallons(gallons);
    }

    public auto(String name, int miles, double gallons){
        model = name;
        SetGallons(gallons);
        SetMiles(miles);
    }

    public void SetGallons(double gallons){
        if (gallons < 0)
            this.gallons = 0;
        else
            this.gallons = gallons;
    }

    public void SetMiles(int miles){
        if (miles < 0)
            this.miles = 0;
        else
            this.miles = miles;
    }
    public void setModel(String newmod){
        model = newmod;
    }
    public String toString()
    {
        return ("The mode is "+GetModel()+" with "+GetMiles()+" miles and "+GetGallons()+" gallons of gas.");
    }

    public String GetModel(){
        return model;}
    public int GetMiles(){
        return this.miles;}
    public double GetGallons(){
        return this.miles;}
    public boolean equals (Object dog) {
        if (dog instanceof auto && toString().equals(dog.toString()))
            return true;
        else
            return false;
    }
}
