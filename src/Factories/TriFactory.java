package Factories;

import Classes.Shape;
import Classes.Triangle;

public class TriFactory extends ShapesFactory {

    @Override
    public Shape createShape(String name) {
        if (name.equals("Triangle")) {
            return new Triangle();
        }
        return null;
    }

}
