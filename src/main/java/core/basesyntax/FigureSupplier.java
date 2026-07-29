package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getDefaultFigure() {
        return new Circle(10, ColorSupplier.getRandomColor());
    }

    public static Figure getRandomFigure() {
        Random random = new Random();
        int typeFigure = random.nextInt(5);
        switch (typeFigure) {
            case 0:
                return new Square();
            case 1:
                return new Circle();
            case 2:
                return new IsoscelesTrapezoid();
            case 3:
                return new Rectangle();
            case 4:
                return new RightTriangle();
        }
        return getDefaultFigure();
    }
}
