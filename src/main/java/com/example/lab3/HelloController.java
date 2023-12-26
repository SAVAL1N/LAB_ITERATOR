package com.example.lab3;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import model.ConcreteAggregate;
import model.Iterator;

public class HelloController {
    @FXML
    public ImageView image;
    public ConcreteAggregate conc = new ConcreteAggregate("");
    public Iterator iter;
    public TextField speedtime;
    public Timeline timeline;

    public HelloController() {
        this.iter = this.conc.getIterator();
        this.timeline = new Timeline();
        this.speedtime = new TextField();
    }

    @FXML
    protected void onStartButtonClick() {
        int speed = Integer.parseInt(this.speedtime.getText());
        this.timeline = new Timeline();
        this.timeline.setCycleCount(-1);
        this.timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(speed), event -> {
            if (HelloController.this.iter.hasNext()) {
                HelloController.this.image.setImage(HelloController.this.iter.next());
            } else {
                HelloController.this.image.setImage(HelloController.this.iter.preview());
            }

        }, new KeyValue[0]));
        this.timeline.play();
    }

    @FXML
    protected void onStopButtonClick() {
        timeline.stop();
    }

    @FXML
    protected void onBackButtonClick() {
        showPreviousImage();
    }

    @FXML
    protected void onNextButtonClick() {
        showNextImage();
    }


    private void showNextImage() {

        /*       if (this.iter.hasNext()) {*/
        image.setImage(iter.next());
        /*        } else {*/
        /*this.image.setImage(this.iter.preview());*/
        /*  }*/
    }

    private void showPreviousImage() {
        /*        if (this.iter.hasBack()) {*/
        image.setImage(iter.back());
        /*        } else {*/
        /*  this.image.setImage(this.iter.previewback());*/
 /*       }
    }*/

    }
}
