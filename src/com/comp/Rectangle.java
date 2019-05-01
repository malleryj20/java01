package com.comp;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Shape
{
    public Rectangle(int xx, int yy, int widthx, int heightx )
    {
        x = xx;
        y = yy;
        width = widthx;
        height = heightx;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimiter() {
        return 2*(width + height);
    }

    @Override
    public double getVolume(int depth) {
        return getArea()*depth;
    }

    @Override
    public void draw(GraphicsContext con) {
        con.fillRect(x, y, width, height);
    }
}
