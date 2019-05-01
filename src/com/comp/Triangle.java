package com.comp;


import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Shape {
    public Triangle(int xx, int yy, int widthx, int heightx )
    {
        x = xx;
        y = yy;
        width = widthx;
        height = heightx;
    }
    public double getArea(){
        return .5*width*height;
    }
    public double getPerimiter(){
        return width+2*(Math.sqrt(.5*width*.5*width+height*height));
    }
    public double getVolume(int depth){
        return getArea()*depth;
    }
    public void draw(GraphicsContext con){
        con.strokeLine(x, y, x+width, y);
        con.strokeLine(x, y, x+width/2, y+height);
        con.strokeLine(x+width/2, y+height, x+width, y);
    }
}
