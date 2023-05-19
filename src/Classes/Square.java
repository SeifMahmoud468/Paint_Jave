package Classes;

import Factories.QuadFactory;
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape implements Cloneable {

    private int x1, x2, y1, y2;
    int length;

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (!getFill()) {
            if (x1 < x2 && y1 < y2) {
                length = Math.abs(y2 - y1);
                g.drawRect(x1, y1, length, length);
            } else if (x1 > x2 && y1 > y2) {
                length = Math.abs(y2 - y1);
                g.drawRect(x1 - length, y1 - length, length, length);
            } else if (x1 > x2 && y1 < y2) {
                length = Math.abs(x2 - x1);
                g.drawRect(x2, y1, length, length);
            } else {
                length = Math.abs(y2 - y1);
                g.drawRect(x1, y2, length, length);
            }
        } else {
            if (x1 < x2 && y1 < y2) {
                length = Math.abs(y2 - y1);
                g.fillRect(x1, y1, length, length);
            } else if (x1 > x2 && y1 > y2) {
                length = Math.abs(y2 - y1);
                g.fillRect(x1 - length, y1 - length, length, length);
            } else if (x1 > x2 && y1 < y2) {
                length = Math.abs(x2 - x1);
                g.fillRect(x2, y1, length, length);
            } else {
                length = Math.abs(y2 - y1);
                g.fillRect(x1, y2, length, length);
            }
        }
    }

    @Override
    public boolean contains(int x, int y) {
        if (x1 < x2 && y1 < y2) {
            length = Math.abs(y2 - y1);
            if (x <= x1 + length && x >= x1 && y <= y1 + length && y >= y1) {
                return true;
            }
        } else if (x1 > x2 && y1 > y2) {
            length = Math.abs(x2 - x1);
            if (x <= x2 + length && x >= x2 && y <= y2 + length && y >= y2) {
                return true;
            }
        } else if (x1 > x2 && y1 < y2) {
            length = Math.abs(x2 - x1);
            if (x <= x2 + length && x >= x2 && y <= y1 + length && y >= y1) {
                return true;
            }
        } else {
            length = Math.abs(x2 - x1);
            if (x <= x1 + length && x >= x1 && y <= y2 + length && y >= y2) {
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
        Square s = (Square) super.clone();
        s.setX1(x1 + 10);
        s.setX2(x2 + 10);
        s.setY1(y1 + 10);
        s.setY2(y2 + 10);
        return s;
    }

    @Override
    public void name() {
        System.out.println("Figure's name is: Square");
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

    public static Square squareCreator(int x1, int x2, int y1, int y2, Color color, boolean fill) {
        QuadFactory f = new QuadFactory();
        Square s = (Square) f.createShape("Square");
        s.setX1(x1);
        s.setX2(x2);
        s.setY1(y1);
        s.setY2(y2);
        s.setColor(color);
        s.setFill(fill);
        return s;

    }

}
