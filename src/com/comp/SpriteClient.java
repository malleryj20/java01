package com.comp;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SpriteClient extends Application {

    private Sprite s1, s2, s3;


    @Override
    public void start(Stage stage) {
        ArrayList g = new ArrayList();
        int min = 121;
        int max = -51;
        int avg = 0;
        String test;
        boolean stop = true;
        /*for (int i = 0; i <= 11; i++){
            while (stop){

                test = JOptionPane.showInputDialog("Temperature for month "+ (i+1) +":");
                if (isInt(test)){
                    stop = false;
                    g.add(test);
                    if (Integer.parseInt(g.get(0).toString()) > max)
                        max = Integer.parseInt(g.get(0).toString());
                    if (Integer.parseInt(g.get(0).toString()) < min)
                        min = Integer.parseInt(g.get(0).toString());
                    avg += Integer.parseInt(g.get(0).toString());
                }
            }
            stop = true;


        } */
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Shapes", 200, 370);

        /*new Sprite(10, Integer.parseInt(g.get(0).toString())).draw(gc, "Jan");
        new Sprite(40, Integer.parseInt(g.get(1).toString())).draw(gc, "Feb");
        new Sprite(70, Integer.parseInt(g.get(2).toString())).draw(gc, "Mar");
        new Sprite(100, Integer.parseInt(g.get(3).toString())).draw(gc, "Apr");
        new Sprite(130, Integer.parseInt(g.get(4).toString())).draw(gc, "May");
        new Sprite(160, Integer.parseInt(g.get(5).toString())).draw(gc, "Jun");
        new Sprite(190, Integer.parseInt(g.get(6).toString())).draw(gc, "Jly");
        new Sprite(220, Integer.parseInt(g.get(7).toString())).draw(gc, "Aug");
        new Sprite(250, Integer.parseInt(g.get(8).toString())).draw(gc, "Sep");
        new Sprite(280, Integer.parseInt(g.get(9).toString())).draw(gc, "Oct");
        new Sprite(310, Integer.parseInt(g.get(10).toString())).draw(gc, "Nov");
        new Sprite(340, Integer.parseInt(g.get(11).toString())).draw(gc, "Dec");*/


        /* s1 = new Sprite(100, 50, .5);
        s2 = new Sprite(225, 100, 1);
        s3 = new Sprite(100, 300, 1.5);

        s1.draw(gc);
        s2.draw(gc);
        s3.draw(gc); */
        Shape[] drawUs = {new Circle(30, 40, 15), new Rectangle(100, 100, 30, 43), new Triangle(170, 50, 20, 40)};
        for (int i = 0; i < drawUs.length; i++){
            drawUs[i].draw(gc);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static boolean isInt(String in) {
        Scanner scan = new Scanner(in.trim());
        if(!scan.hasNextInt(10)) return false;
        scan.nextInt(10);
        return !scan.hasNext();
    }

}
