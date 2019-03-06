package com.comp;

public class auto {
    private String model;
    private double gog;
    private int md;

    public auto(String name, double gallons){
        model = name;
        SetGallons(gallons);
    }

    public auto(String name, int miles, double gallons){
        model = name;
        SetGallons(gallons);
        SetMiles(miles);
    }

    public void SetGallons(double gallons){
        if (gallons < 0)
            gog = 0;
        else
            gog=gallons;
    }

    public void SetMiles(int miles){
        if (miles < 0)
            md = 0;
        else
            md=miles;
    }
    public String toString()
    {
        return ("The mode is "+GetModel()+" with "+GetMiles()+" miles and "+GetGallons()+" gallons of gas.");
    }

    public String GetModel(){
        return model;}
    public int GetMiles(){
        return md;}
    public double GetGallons(){
        return gog;}
}
