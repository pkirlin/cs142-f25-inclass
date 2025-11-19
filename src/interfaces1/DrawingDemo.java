package interfaces1;

import java.awt.*;
import java.util.ArrayList;

public class DrawingDemo {
    public static void main(String[] args)
    {
        Circle circle = new Circle(50, Color.RED);
        Square square = new Square(60, Color.BLUE);
        Dog fido = new Dog("Fido", 2);
        ShowDog lassie = new ShowDog("Lassie", 5);
        Cat snowball = new Cat("Snowball", 3);

        // Write code here to make an arraylist and add the
        // objects we want to draw into the arraylist.
        ArrayList<Drawable> list = new ArrayList<Drawable>();
        list.add(circle);
        list.add(square);
        list.add(fido);
        list.add(lassie);
        list.add(snowball);

        // Call the drawAllObjects function.
        drawAllObjects(list);
    }

    public static void drawAllObjects(ArrayList<Drawable> list)
    {
        SimpleCanvas canvas = new SimpleCanvas(500, 500);

        for (Drawable d : list) {
            d.drawOn(canvas, (int)(Math.random() * 500), (int)(Math.random() * 500));
        }

        canvas.show();
    }
}
