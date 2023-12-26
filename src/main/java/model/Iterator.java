package model;

import javafx.scene.image.Image;

public interface Iterator {
    boolean hasNext();

    boolean hasBack ();
    Image next();

    Image back ();
    Image preview();
}
