package shapes;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Desenha um círculo");
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
