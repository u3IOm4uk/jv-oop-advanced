package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        Random random = new Random();
        this.firstLeg = random.nextInt(1, 10);
        this.secondLeg = random.nextInt(1, 10);
        this.color = ColorSupplier.getRandomColor();
    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rectangle, area: " + this.getArea()
                + " sq. units, sideA: " + this.firstLeg
                + " units, sideB: " + this.secondLeg
                + " units, color: " + this.color);
    }
}
