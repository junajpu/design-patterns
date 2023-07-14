package adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    SquarePegAdapter(SquarePeg peg){
        super();
        this.peg = peg;
    }
    public int getRadius(){
        double newRadius = peg.getWidth() * Math.sqrt(2)/2;
        return (int) newRadius;
    }
}
