package com.comp;

public class Pixel {
    private int red, blue, green;
    public Pixel(int mR, int mG, int mB){
        red = mR;
        green = mG;
        blue = mB;
    }
    public String toString(){return ("("+red+", "+green+", "+blue+")");}
}
