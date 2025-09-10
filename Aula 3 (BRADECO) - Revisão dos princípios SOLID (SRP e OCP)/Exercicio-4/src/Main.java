import shapes.*;
import strategy.*;
import java.util.*;

public class Main {
    public static void drawAllShapes(List<Shape> shapes, Comparator<Shape> strategy) {
        shapes.stream()
              .sorted(strategy)
              .forEach(Shape::draw);
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());

        System.out.println("Ordenação: Circle primeiro");
        drawAllShapes(shapes, new CircleFirstStrategy());

        System.out.println("\nOrdenação: Square primeiro");
        drawAllShapes(shapes, new RectangleFirstStrategy());

        System.out.println("\nOrdenação: Triangle primeiro");
        drawAllShapes(shapes, new TriangleFirstStrategy());
    }
}

/*
 Resposta às perguntas:
 a) É possível adicionar ordem ao código do exercício anterior sem alterar
    o código-fonte pré-existente?
    Não. No exercício anterior, só desenhávamos as formas. Para adicionar
    ordem precisaríamos mexer no código, violando OCP.

 b) Como a refatoração atende ao OCP?
    Agora o código está aberto para extensão (podemos criar novas estratégias
    de ordenação implementando Comparator<Shape>) e fechado para modificação
    (não precisamos mudar a lógica da main nem das classes Shape).
    A Main apenas recebe a estratégia como parâmetro, respeitando o OCP e o
    padrão Strategy.
*/
