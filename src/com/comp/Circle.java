package com.comp;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
    public Circle(int xx, int yy, int radius){
        x = xx;
        y = yy;
        height = 2*radius;
    }
    @Override
    public double getArea() {
        return Math.PI*(.5*height)*(.5*height);
    }

    @Override
    public double getPerimiter() {
        return Math.PI*height;
    }
    public double getVolume(int depth){
        return getArea()*depth;
    }
    public void draw(GraphicsContext con){
        con.fillOval(x, y, height, height);

    }
}
