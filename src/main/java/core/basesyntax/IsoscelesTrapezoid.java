package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid() {
        Random random = new Random();
        this.bottomSide = random.nextInt(1, 10);
        this.topSide = random.nextInt(1, 10);
        this.height = random.nextInt(1, 10);
        this.color = ColorSupplier.getRandomColor();
    }

    public IsoscelesTrapezoid(int topSide, int bottomSide, int leg, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = leg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) ((topSide * bottomSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isoscelesTrapezoid, area: " + this.getArea()
                + " sq. units, topSide: " + this.topSide
                + " units, bottomSide: " + this.bottomSide
                + " units, height: " + this.height
                + " units, color: " + this.color);
    }
}
