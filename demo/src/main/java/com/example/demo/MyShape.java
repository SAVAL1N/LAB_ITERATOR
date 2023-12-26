package com.example.demo;

import javafx.scene.paint.Color;

public abstract class MyShape {
    String color;
    abstract double area();
    public abstract String toString();
    abstract void draw(Color color);
    public MyShape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
