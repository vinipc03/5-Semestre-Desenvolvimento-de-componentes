package shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Desenha um quadrado");
    }

    @Override
    public String getName() {
        return "Square";
    }
}
