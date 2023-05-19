package Classes;

import Factories.OneLineFactory;
import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape implements Cloneable {

    private int x1, y1;
    private int x2, y2, length;

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
        if (!getFill()) {
            if (x1 < x2 && y1 < y2) {
                length = Math.abs(y2 - y1);
                g.drawOval(x1, y1, length, length);
            } else if (x1 > x2 && y1 > y2) {
                length = Math.abs(y2 - y1);
                g.drawOval(x1 - length, y1 - length, length, length);
            } else if (x1 > x2 && y1 < y2) {
                length = Math.abs(x2 - x1);
                g.drawOval(x2, y1, length, length);
            } else {
                length = Math.abs(y2 - y1);
                g.drawOval(x1, y2, length, length);
            }
        } else {
            if (x1 < x2 && y1 < y2) {
                length = Math.abs(y2 - y1);
                g.fillOval(x1, y1, length, length);
            } else if (x1 > x2 && y1 > y2) {
                length = Math.abs(y2 - y1);
                g.fillOval(x1 - length, y1 - length, length, length);
            } else if (x1 > x2 && y1 < y2) {
                length = Math.abs(x2 - x1);
                g.fillOval(x2, y1, length, length);
            } else {
                length = Math.abs(y2 - y1);
                g.fillOval(x1, y2, length, length);
            }
        }
    }

    @Override
    public boolean contains(int x, int y) {
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        double h = ((x2 + x1) * 1.0) / 2;
        double k = ((y2 + y1) * 1.0) / 2;
        double p = ((Math.pow((x - h), 2) / Math.pow(a, 2))
                + (Math.pow((y - k), 2) / Math.pow(b, 2)));
        return p <= 1;
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
        Circle c = (Circle) super.clone();
        c.setX1(x1 + 10);
        c.setX2(x2 + 10);
        c.setY1(y1 + 10);
        c.setY2(y2 + 10);
        return c;
    }

    @Override
    public void name() {
        System.out.println("Figure's name is: Circle");
    }

    @Override
    public void vertices() {
        System.out.println("No of vertices is: 0 ");

    }

    @Override
    public void sides() {
        System.out.println("A circle is formed of 1 circular line");
    }

    public static Circle circleCreator(int x1, int y1, int x2, int y2, Color color, boolean fill) {
        OneLineFactory f = new OneLineFactory();
        Circle c = (Circle) f.createShape("Circle");
        c.setX1(x1);
        c.setX2(x2);
        c.setY1(y1);
        c.setY2(y2);
        c.setColor(color);
        c.setFill(fill);
        return c;
    }

}
