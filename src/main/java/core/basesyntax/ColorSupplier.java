package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {
            "Red", "Green", "Blue", "Yellow", "Orange", "Purple", "White", "Black"
    };

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
