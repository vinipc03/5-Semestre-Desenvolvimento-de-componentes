package strategy;

import shapes.Shape;
import java.util.Comparator;

public class TriangleFirstStrategy implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        if (s1.getName().equals("Triangle") && !s2.getName().equals("Triangle")) return -1;
        if (s2.getName().equals("Triangle") && !s1.getName().equals("Triangle")) return 1;
        return s1.getName().compareTo(s2.getName());
    }
}
