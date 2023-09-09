package composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    private ArrayList<Graphic> graphics;


    public void add(Graphic child){
        this.graphics.add(child);
    }
    public void remove(Graphic child){
        this.graphics.remove(child);
    }
    @Override
    public void move(int x, int y) {
        for (Graphic child:
             this.graphics) {
            child.move(x,y);
        }
    }

    @Override
    public void draw() {

    }
}
