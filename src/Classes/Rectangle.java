package Classes;

import Factories.QuadFactory;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape implements Cloneable {

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
        if (!getFill()) {
            if (x1 < x2 && y1 < y2) {
                g.drawRect(x1, y1, x2 - x1, y2 - y1);
            } else if (x1 > x2 && y1 > y2) {
                g.drawRect(x2, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
            } else if (x1 > x2 && y1 < y2) {
                g.drawRect(x2, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
            } else {
                g.drawRect(x1, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
            }
        } else {
            if (x1 < x2 && y1 < y2) {
                g.fillRect(x1, y1, x2 - x1, y2 - y1);
            } else if (x1 > x2 && y1 > y2) {
                g.fillRect(x2, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
            } else if (x1 > x2 && y1 < y2) {
                g.fillRect(x2, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
            } else {
                g.fillRect(x1, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
            }
        }
    }

    @Override
    public boolean contains(int x, int y) {
        if (getX1() < getX2() && getY1() < getY2()) {
            if (x <= x2 && x >= x1 && y <= y2 && y >= y1) {
                return true;
            }
        } else if (getX1() > getX2() && getY1() > getY2()) {
            if (x <= x1 && x >= x2 && y <= y1 && y >= y2) {
                return true;
            }
        } else if (getX1() > getX2() && getY1() < getY2()) {
            if (x <= x1 && x >= x2 && y <= y2 && y >= y1) {
                return true;
            }
        } else {
            if (x <= x2 && x >= x1 && y <= y1 && y >= y2) {
                return true;
            }
        }
        return false;
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
        Rectangle r = (Rectangle) super.clone();
        r.setX1(x1 + 10);
        r.setX2(x2 + 10);
        r.setY1(y1 + 10);
        r.setY2(y2 + 10);
        return r;
    }

    @Override
    public void name() {
        System.out.println("Figure's name is: Rectangle");
    }

    @Override
    public void vertices() {
        System.out.println("No of vertices is: 4");
        System.out.println("Vertices are: (" + this.x1 + "," + this.y1 + ")");
        System.out.println("              (" + this.x2 + "," + this.y1 + ")");
        System.out.println("              (" + this.x1 + "," + this.y2 + ")");
        System.out.println("              (" + this.x2 + "," + this.y2 + ")");
    }

    @Override
    public void sides() {
        System.out.println("No of sides is: 4");
    }

    public static Rectangle rectangleCreator(int x1, int x2, int y1, int y2, Color color, boolean fill) {
        QuadFactory f = new QuadFactory();
        Rectangle r = (Rectangle) f.createShape("Rectangle");
        r.setX1(x1);
        r.setX2(x2);
        r.setY1(y1);
        r.setY2(y2);
        r.setColor(color);
        r.setFill(fill);
        return r;
    }
}
