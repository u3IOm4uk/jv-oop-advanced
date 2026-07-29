package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int width;
    private int height;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Rectangle() {
        Random random = new Random();
        this.width = random.nextInt(1, 10);
        this.height = random.nextInt(1, 10);
        this.color = colorSupplier.getRandomColor();
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) (width * height);
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rectangle, area: " + this.getArea()
                + " sq. units, width: " + width
                + " units, height: " + height
                + " units, color: " + color);
    }
}
