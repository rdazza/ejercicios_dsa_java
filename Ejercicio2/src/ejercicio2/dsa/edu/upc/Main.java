package ejercicio2.dsa.edu.upc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangulo(3, 5);

        for (Shape shape : shapes)
            System.out.println(shape + " with area = " + shape.area());
    }
}

