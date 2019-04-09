package com.redeem;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Sprite {
    private int sX;
    private int sY;
    private double scale;

    public Sprite(int x, int y, double tempscale){
        setCoordinates(x, y);
        setScale(tempscale);
    }

    public Sprite(int x, int y){
        setCoordinates(x, y);
        scale = 1;
    }

    public Sprite(){
        scale = 1;
    }

    public int getsX(){
        return sX;
    }

    public int getsY(){
        return sY;
    }

    public double getscale(){
        return scale;
    }

    public Sprite setCoordinates(int x, int y){
        sX = x;
        sY = y;
        return this;
    }

    public Sprite setScale(double sc){
        scale = sc;
        return this;
    }

    public String toString(){
        return ("" + sX + sY + scale);
    }

    public boolean equals (Object x) {
        if (x instanceof Sprite){
            Sprite g = (Sprite)x;
            if (sX == g.getsX() && sY == g.getsY() && scale == g.getscale())
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public void draw(GraphicsContext gc, String month){
        if (sY < 55){
            gc.setFill(Color.BLUE);
        }
        else if (sY < 78){
            gc.setFill(Color.YELLOW);
        }
        else{
            gc.setFill(Color.RED);
        }
        gc.fillRect(sX, 200-sY, 20, sY);
        gc.setFill(Color.BLACK);
        gc.fillText(month, sX, 170-sY);
        gc.fillText(" "+sY, sX, 190-sY);
        /* gc.setFill(Color.CORAL);
        gc.fillOval(sX, sY+15*scale, 90*scale, 120*scale);
        gc.setFill(Color.DARKGOLDENROD);
        gc.fillRect(sX + 23* scale, sY, 45*scale, 22*scale);
        gc.setStroke(Color.DARKGOLDENROD);
        gc.setLineWidth(3);
        gc.strokeLine(sX, sY + 23*scale, sX + 90* scale, sY + 23*scale);
        gc.setFill(Color.CHOCOLATE);
        gc.fillOval(sX + 60*scale, sY+45*scale, 18*scale, 12*scale);
        gc.setFill(Color.DARKSALMON);
        gc.fillOval(sX+45*scale, sY +125*scale, 45*scale, 12*scale);
        gc.strokeOval(sX+45*scale, sY +125*scale, 45*scale, 12*scale);
        gc.fillOval(sX + 27*scale, sY + 127*scale, 45*scale, 12*scale);
        gc.strokeOval(sX + 27*scale, sY + 127*scale, 45*scale, 12*scale); */

    }

}
