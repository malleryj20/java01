package com.comp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        double r = -1;
	ArrayList<auto> g = new ArrayList();
        g.add(new auto("Rover", 16, 12.0));
        g.add(new auto("Jeep", 2400, 18.3));
        g.add(new auto("Honda", 8600, 26.0));

        for (int i = 0; i < g.toArray().length; i++){
            System.out.println(g.get(i).toString());
        }

        for (int i = 0; i < g.toArray().length; i++){
            g.get(i).setModel("Civic");
        }

        for (int i = 0; i < g.toArray().length; i++){
            if (g.get(i).GetGallons() > r)
                r = g.get(i).GetGallons();
        }

        System.out.println(r);

        r = 0;

        for (int i = 0; i < g.toArray().length; i++){
            if (g.get(i).equals("Civic"))
            r += 1;
        }

        System.out.println(r);


    }
}
