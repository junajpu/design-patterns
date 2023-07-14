package adapter;

public class RoundHole extends Round {

    RoundHole(int radius){
        super(radius);
    }
    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}
