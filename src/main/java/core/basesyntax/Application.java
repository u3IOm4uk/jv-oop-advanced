package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }

}
