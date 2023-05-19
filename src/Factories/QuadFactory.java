package Factories;

import Classes.Rectangle;
import Classes.Shape;
import Classes.Square;

public class QuadFactory extends ShapesFactory {

    @Override
    public Shape createShape(String name) {
        if (name.equals("Square")) {
            return new Square();
        } else if (name.equals("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

}
