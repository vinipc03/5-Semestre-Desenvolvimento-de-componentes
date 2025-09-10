package shapes;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Desenha um triângulo");
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
