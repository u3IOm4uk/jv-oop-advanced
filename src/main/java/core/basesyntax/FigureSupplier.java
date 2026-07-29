package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

    public Figure getRandomFigure() {
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
            default:
                return getDefaultFigure();
        }
    }
}
