package strategy;

import shapes.Shape;
import java.util.Comparator;

public class RectangleFirstStrategy implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        if (s1.getName().equals("Square") && !s2.getName().equals("Square")) return -1;
        if (s2.getName().equals("Square") && !s1.getName().equals("Square")) return 1;
        return s1.getName().compareTo(s2.getName());
    }
}
