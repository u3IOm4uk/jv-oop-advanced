package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle() {
        Random random = new Random();
        this.radius = random.nextInt(1, 10);
        this.color = colorSupplier.getRandomColor();
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: Circle, area: " + this.getArea()
                + " sq. units, radius: " + this.radius
                + " units, color: " + this.color);
    }
}
