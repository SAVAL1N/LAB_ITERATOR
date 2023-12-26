package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RndRect extends MyShape{
    double len;
    double wid;
    GraphicsContext gc;
    double radius;
    public RndRect(String color,double len, double wid,double radius, GraphicsContext gc ) {
        super(color);
        this.len = len;
        this.wid = wid;
        this.radius = radius;
        this.gc = gc;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Round rect\n" + "Color: " + color;
    }

    @Override
    void draw(Color color) {
        gc.clearRect(0,0,gc.getCanvas().getWidth(),gc.getCanvas().getHeight());
        gc.setFill(color);
        gc.fillRoundRect(0,0,len,wid,radius,radius);

    }
}
