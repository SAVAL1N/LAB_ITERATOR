package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Circle extends MyShape{
    private double rad;
    GraphicsContext gc;
    public Circle(String color, double radius, GraphicsContext gc) {
        super(color);
        this.rad = radius;
        this.gc = gc;
    }

    @Override
    double area() {
        return Math.PI * ((rad/10) * (rad/10));
    }

    @Override
    public String toString() {
        return "Circle color: " + super.color
                + "\nCircle area is: " + area();
    }

    @Override
    void draw(Color color) {
        gc.clearRect(0,0,gc.getCanvas().getWidth(),gc.getCanvas().getHeight());
        gc.setFill(color);
        gc.fillOval(0,0,rad,rad);
    }

}
