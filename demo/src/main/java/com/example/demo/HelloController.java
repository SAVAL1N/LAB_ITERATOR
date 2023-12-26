package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    protected Pane figurePane;
    @FXML
    private Label figureText;
    @FXML
    private Canvas canvas = new Canvas(450, 200);


    public void onRectButtonClick(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Rect rect = new Rect("Red", 250, 200, gc);
        rect.draw(Color.RED);
        figureText.setText(String.valueOf(rect));
        figurePane.getChildren().remove(canvas);
        figurePane.getChildren().add(canvas);
    }
    public void onCircleButtonClick() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Circle circle = new Circle("Yellow", 200,  gc);
        circle.draw(Color.YELLOW);
        figureText.setText(String.valueOf(circle));
        figurePane.getChildren().remove(canvas);
        figurePane.getChildren().add(canvas);
    }
    public void onTriangleButtonClick() {
        double[] cordsX = new double[]{0,0,150};
        double[] cordsY = new double[]{0,200,200};
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Triangle triangle = new Triangle("Green", cordsX,cordsY,3, gc);
        triangle.draw(Color.GREEN);
        figureText.setText(String.valueOf(triangle));
        figurePane.getChildren().remove(canvas);
        figurePane.getChildren().add(canvas);
    }
    public void onArcButtonClick() {
        double[] cordsX = new double[]{0,0,200,200,120,250};
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Arc arc = new Arc("Cyan",gc, cordsX);
        arc.draw(Color.CYAN);
        figureText.setText(String.valueOf(arc));
        figurePane.getChildren().remove(canvas);
        figurePane.getChildren().add(canvas);
    }

    public void onRndRectButtonClick() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        RndRect rndRect = new RndRect("PALETURQUOISE",250, 200,50,gc);
        rndRect.draw(Color.PALETURQUOISE);
        figureText.setText(String.valueOf(rndRect));
        figurePane.getChildren().remove(canvas);
        figurePane.getChildren().add(canvas);
    }
}