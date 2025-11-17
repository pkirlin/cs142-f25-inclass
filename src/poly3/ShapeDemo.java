package poly3;

import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Triangle tri = new Triangle(3, 5);
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(sq);
        shapes.add(tri);

        // write a loop here to calculate the TOTAL area of all shapes.
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        System.out.println(total);
    }
}
