package Factories;

import Classes.Circle;
import Classes.Line;
import Classes.Shape;

public class OneLineFactory extends ShapesFactory {

    @Override
    public Shape createShape(String name) {
        if (name.equals("Line")) {
            return new Line();
        } else if (name.equals("Circle")) {
            return new Circle();
        }
        return null;
    }

}
