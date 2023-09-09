package composite;

public class Circle extends Dot{
    private int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {

    }
}
