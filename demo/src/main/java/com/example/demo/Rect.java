package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Rect extends MyShape{
    double len;
    double wid;
    GraphicsContext gc;
    public Rect(String color, double len, double wid, GraphicsContext gc) {
        super(color);
        this.len = len;
        this.wid = wid;
        this.gc = gc;
    }

    @Override
    double area() {
        return len/10 * wid/10;
    }

    @Override
    public String toString() {
        return "Rectangle color: " + super.color
                + "\nRectangle area is: " + area();
    }

    @Override
    void draw(Color color) {
        gc.clearRect(0,0,gc.getCanvas().getWidth(),gc.getCanvas().getHeight());
        gc.setFill(color);
        gc.fillRect(0,0, len, wid);
    }

}
