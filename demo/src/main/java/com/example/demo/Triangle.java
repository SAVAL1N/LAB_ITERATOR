package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends MyShape{
    double[] cordsX;
    double[] cordsY;
    int nPoint;
    GraphicsContext gc;
    public Triangle(String color, double[] cordsX, double[] cordsY, int nPoint, GraphicsContext gc) {
        super(color);
        this.cordsX = cordsX;
        this.cordsY = cordsY;
        this.nPoint = nPoint;
        this.gc = gc;
    }

    @Override
    double area() {
        return ((cordsY[1]/10) * (cordsX[2]/10))/2;
    }
    @Override
    public String toString() {
        return "Triangle color: " + super.color
                + "\nTriangle area is: " + area();
    }

    @Override
    void draw(Color color) {
        gc.clearRect(0,0,gc.getCanvas().getWidth(),gc.getCanvas().getHeight());
        gc.setFill(color);
        gc.fillPolygon(cordsX, cordsY, nPoint);
    }
}
