package com.comp;

import java.util.ArrayList;

public class AlterImage {
    public static Pixel[][] generatePixelArray(int[][] reds, int[][] greens, int[][] blues){

        Pixel[][] fin = new Pixel[reds.length][reds[0].length];
        for (int i = 0; i < reds.length; i++){
            for (int r = 0; r < reds[0].length; r++){
                fin[i][r] = new Pixel(reds[i][r], greens[i][r], blues[i][r]);
            }

        }

        return (fin);
    }
    public static Pixel[][] flipImage(Pixel[][] image, boolean type){
        Pixel[][] fin = new Pixel[image.length][image[0].length];
        for (int i = 0; i < image.length; i++){
            for (int r = 0; r < image[0].length; r++){
                if (type){
                    fin[i][r] = (image[image.length-i-1][r]);
                }
                else{
                    fin[i][r] = (image[i][image[0].length-r-1]);
                }
            }

        }
        return (fin);
    }
}
