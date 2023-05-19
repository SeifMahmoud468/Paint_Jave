package Classes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Cloneable{

    private Color color;
    private boolean fill;

    public Shape() {

    }

    public Shape(Color color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public boolean getFill() {
        return fill;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics g);

    public abstract boolean contains(int x, int y);

    public abstract void move(int x, int y);

    public abstract void resize(int x, int y);

    public abstract void name();

    public abstract void vertices();

    public abstract void sides();

    public void properties() {
        name();
        vertices();
        sides();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}
