package com.comp;

import java.util.ArrayList;

public class ArrayFill2D {
    public static void main(String[] args) {

    }
    public static boolean[][] makeGrid(int rows, int cols){
        boolean[][] grid;
        ArrayList<Boolean> a = new ArrayList<Boolean>();
        ArrayList<Boolean[]> b = new ArrayList<Boolean[]>();
        boolean t = false;
        for (int i = 1; i <= rows; i++){
            for (int g = 1; g <= cols; g++){
                t = !t;
                a.add(t);
            }
            b.add(((Boolean[]) a.toArray()));
        }
        return ((boolean[][]) b.toArray());
    }
}
