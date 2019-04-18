package com.comp;

import java.io.*;
import java.util.*;

public class fileUser {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> g = new ArrayList<>();
        Scanner s = new Scanner(new File("C:\\Users\\legen\\Desktop\\java01\\src\\com\\comp\\words.txt"));
        while (s.hasNext()) {
            g.add(s.next());
        }
        for (int i = 0; i < g.toArray().length; i++)
            System.out.println(g.get(i));
        System.out.println();
        for (int i = g.toArray().length -1; i >= 0; i--)
            System.out.println(g.get(i));
        System.out.println();
        for (int i = 0; i < g.toArray().length; i++){
            if (isPlural(g.get(i)))
            System.out.println(g.get(i).toUpperCase());
            else
                System.out.println(g.get(i));
        }
        System.out.println();
        for (int i = 0; i < g.toArray().length; i++){
            if (!isPlural(g.get(i)))
                System.out.println(g.get(i));
        }


    }

    public static boolean isPlural(String word){
        return (word.charAt(word.length()-1) == 's' || word.charAt(word.length()-1) == 'S');
    }
}
