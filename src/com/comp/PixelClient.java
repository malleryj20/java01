package com.comp;

public class PixelClient {
    public static void main(String[] args) {
        int[][] red = {{1,2,3},{4, 5, 6},{7,8,9}};
        int[][] green = {{7,7,7},{7,7,7},{7,7,7}};
        int[][] blue = {{2,4,6},{8, 10, 12},{14, 16, 18}};
        Pixel[][] pxls = AlterImage.generatePixelArray(red, green, blue);
        pxls = AlterImage.flipImage(pxls, false);
        for (int i = 0; i < pxls.length; i++){
            for (int r = 0; r < pxls[0].length; r++){
                System.out.print(pxls[i][r].toString() +"   ");
            }
            System.out.println();

        }
    }

}
