package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Arc extends MyShape{
    GraphicsContext gc;
    double[] mass;
    public Arc(String color, GraphicsContext gc, double[] mass) {
        super(color);
        this.gc = gc;
        this.mass = mass;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Arc\n" + "Color: " + color;
    }

    @Override
    void draw(Color color) {
        gc.clearRect(0,0,gc.getCanvas().getWidth(),gc.getCanvas().getHeight());
        gc.setFill(color);
        gc.fillArc(mass[0],mass[1],mass[2],mass[3],mass[4],mass[5], ArcType.ROUND );
    }
}
