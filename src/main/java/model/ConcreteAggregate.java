package model;

import javafx.scene.image.Image;
import java.nio.file.Paths;

public class ConcreteAggregate implements
        Aggregate{
    private String filetopic;
    @Override
    public Iterator getIterator() {
        return new ImageIterator();
    }
    public ConcreteAggregate(String filetopic)
    {
        this.filetopic = filetopic;
    }
    private class ImageIterator implements Iterator{
        private int current = 0;
        private Image getImage(int iterator){
            String filename = Paths.get("src/main/resources/"+ filetopic + iterator +".jpg").toUri().toString();
            return new Image(filename);
        }
        @Override
        public boolean hasNext() {
            return !getImage(current+1).isError();
        }

        @Override
        public boolean hasBack() {
            return !getImage(current-1).isError();
        }
        @Override
        public Image next() {
            if(this.hasNext()) {
                return getImage(++current);
            } else {
                current = 1;
                return getImage(current);
            }

        }

        public Image back() {
            if (this.hasBack()) {
                return getImage(--current);
            } else {
                current = 5 ;
                return getImage(current);
            }

        }
        public Image preview() {
            this.current = 1;
            return this.getImage(1);
        }

    }
}