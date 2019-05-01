package com.comp;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public abstract double getArea();
    public abstract double getPerimiter();
    public abstract double getVolume(int depth);
    public abstract void draw(GraphicsContext con);

}
