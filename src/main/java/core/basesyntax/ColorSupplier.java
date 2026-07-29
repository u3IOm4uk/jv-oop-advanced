package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier {
    private static final String[] COLORS = {
            "Red", "Green", "Blue", "Yellow", "Orange", "Purple", "White", "Black"
    };

    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
