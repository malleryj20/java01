package com.comp;

public class MultiDimensional {

    public static void main(String[] args) {
        int [][][] r = {{{1, 2, 4}, {4,6,5},{3,9,2}},{{8, 12, 27},  {9, 24, 6}, {22, 6, 6}},{{68, 4, 12}, {12, 9, 4, 22}}};
        displayArray(r);

    }

    public static void displayArray(int[][][] array){
        for (int i = 0; i < array.length; i++){
            for (int g = 0; g < array[i].length; g++){
                System.out.print("(");
                for (int f = 0; f < array[i][g].length; f++){
                    System.out.print(array[i][g][f] + " ");
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
