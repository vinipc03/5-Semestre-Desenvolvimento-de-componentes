import shapes.*;
import java.util.*;

public class Main {
    public static void drawAllShapes(List<Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(); // Agora não precisamos mais de instanceof
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        drawAllShapes(shapes);
    }
}

/*
 Resposta às perguntas:
 - Por que agora conseguimos adicionar o Triangle sem modificar a main?
   Porque seguimos o Princípio Aberto/Fechado: criamos uma nova classe que
   implementa a interface Shape e a main não precisou ser alterada para
   reconhecer o novo tipo.

 - Como isso se relaciona com o princípio Aberto/Fechado?
   O código agora está "aberto para extensão" (podemos adicionar novas
   figuras implementando Shape) e "fechado para modificação" (não precisamos
   modificar a lógica da main nem da drawAllShapes).
*/
