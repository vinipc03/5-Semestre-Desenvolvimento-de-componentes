package strategy;

import shapes.Shape;
import java.util.Comparator;

public class CircleFirstStrategy implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        if (s1.getName().equals("Circle") && !s2.getName().equals("Circle")) return -1;
        if (s2.getName().equals("Circle") && !s1.getName().equals("Circle")) return 1;
        return s1.getName().compareTo(s2.getName());
    }
}
