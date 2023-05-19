package Classes;

import Factories.OneLineFactory;
import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape implements Cloneable {

    private int x1, y1;
    private int x2, y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());

    }

    @Override
    public boolean contains(int x, int y) {
        if (x1 != x2 && y1 != y2) {
            return (y - y1) / (y2 - y1) == (x - x1) / (x2 - x1);
        } else if (y1 == y2) {
            return (y == y1 && ((x >= x1 && x <= x2) || (x <= x1 && x >= x2)));
        } else {
            return (x == x1 && ((y >= y1 && y <= y2) || (y <= y1 && y >= y2)));
        }

    }

    @Override
    public void move(int x, int y) {
        int x3 = this.x1;
        this.x1 = x;
        this.x2 = x + (x2 - x3);
        int y3 = this.y1;
        this.y1 = y;
        this.y2 = y + (y2 - y3);
    }

    @Override
    public void resize(int x, int y) {
        setX2(x);
        setY2(y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Line l = (Line) super.clone();
        l.setX1(x1 + 10);
        l.setX2(x2 + 10);
        l.setY1(y1 + 10);
        l.setY2(y2 + 10);
        return l;
    }

    @Override
    public void name() {
        System.out.println("Figure's name is: Line");
    }

    @Override
    public void vertices() {
        System.out.println("No of vertices is: 2 (starting and ending points)");
        System.out.println("Starting point is: (" + this.x1 + "," + this.y1 + ")");
        System.out.println("Ending point is: (" + this.x2 + "," + this.y2 + ")");
    }

    @Override
    public void sides() {
        System.out.println("A line consists of only 1 side");
    }

    public static Line LineCreator(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        OneLineFactory f = new OneLineFactory();
        Line l = (Line) f.createShape("Line");
        l.setX1(x1);
        l.setX2(x2);
        l.setY1(y1);
        l.setY2(y2);
        l.setColor(color);
        l.setFill(fill);
        return l;
    }

}
