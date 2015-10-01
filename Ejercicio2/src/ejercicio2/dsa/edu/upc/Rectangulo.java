package ejercicio2.dsa.edu.upc;

/**
 * Created by ruben on 25/09/15.
 */
public class Rectangulo extends AbstractShape {
    private int height;
    private int width;

    public Rectangulo(int height, int width) {
        super("rectangulo");
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void getHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}


