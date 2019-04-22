package com.comp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class numUser {
    public static void main(String[] args) throws FileNotFoundException {

        double r = 0;
        int min, max;
        ArrayList<Integer> g = new ArrayList<>();
        Scanner s = new Scanner(new File("C:\\Users\\legen\\Desktop\\java01\\src\\com\\comp\\numbers.txt"));
        while (s.hasNext()) {
            g.add(Integer.parseInt(s.next()));
        }
        for (int i = 0; i < g.toArray().length; i++) {
            System.out.println(g.get(i));
            r += g.get(i);
        }
        System.out.println();
        System.out.println(("AVG: " + (r / g.toArray().length)));
        System.out.println();
        max = g.get(0);
        min = max;
        for (int i = 0; i < g.toArray().length; i++) {
            if (g.get(i) > max)
                max = g.get(i);
            if (min > g.get(i))
                min = g.get(i);
        }
        System.out.println("MIN: " + min + ", MAX: " + max);
        System.out.println();
        for (int i = 0; i < g.toArray().length; i++) {

            if (g.get(i) % 2 == 1)
                System.out.println(g.get(i));
        }


    }
}
