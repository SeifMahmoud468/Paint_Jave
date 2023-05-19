package Classes;

import Factories.TriFactory;
import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape implements Cloneable {

    private int xArray[];
    private int yArray[];

    public int[] getxArray() {
        return xArray;
    }

    public void setxArray(int[] xArray) {
        this.xArray = xArray;
    }

    public int[] getyArray() {
        return yArray;
    }

    public void setyArray(int[] yArray) {
        this.yArray = yArray;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (!getFill()) {
            g.drawPolygon(xArray, yArray, 3);
        } else {
            g.fillPolygon(xArray, yArray, 3);
        }
    }

    public double Area(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (float) Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    @Override
    public boolean contains(int x, int y) {
        float A = (float) Area(xArray[0], yArray[0], xArray[1], yArray[1], xArray[2], yArray[2]);
        float A1 = (float) Area(x, y, xArray[1], yArray[1], xArray[2], yArray[2]);
        float A2 = (float) Area(xArray[0], yArray[0], x, y, xArray[2], yArray[2]);
        float A3 = (float) Area(xArray[0], yArray[0], xArray[1], yArray[1], x, y);
        return (A == A1 + A2 + A3);
    }

    @Override
    public void move(int x, int y) {
        int x1, y1;
        x1 = xArray[0];
        xArray[0] = xArray[2] = x;
        xArray[1] = x + (xArray[1] - x1);
        y1 = yArray[2];
        yArray[2] = yArray[1] = y;
        yArray[0] = y + (yArray[0] - y1);
    }

    @Override
    public void resize(int x, int y) {
        int a1[] = {getxArray()[0], x, getxArray()[0]};
        setxArray(a1);
        int a2[] = {getyArray()[0], y, y};
        setyArray(a2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Triangle t = (Triangle) super.clone();
        int xs[] = new int[3];
        int ys[] = new int[3];
        for (int i = 0; i < 3; i++) {
            xs[i] = t.xArray[i] + 10;
            ys[i] = t.yArray[i] + 10;
        }
        t.setxArray(xs);
        t.setyArray(ys);
        return t;
    }

    @Override
    public void name() {
        System.out.println("Figure's name is: Triangle");
    }

    @Override
    public void vertices() {
        System.out.println("No of vertices is: 3");
        System.out.println("Vertices are: (" + this.xArray[0] + "," + this.yArray[0] + ")");
        System.out.println("              (" + this.xArray[1] + "," + this.yArray[1] + ")");
        System.out.println("              (" + this.xArray[2] + "," + this.yArray[2] + ")");
    }

    @Override
    public void sides() {
        System.out.println("No of sides is: 3");
    }

    public static Triangle TriangleCreator(int x[], int y[], Color color, boolean fill) {
        TriFactory f = new TriFactory();
        Triangle t = (Triangle) f.createShape("Triangle");
        t.setxArray(x);
        t.setyArray(y);
        t.setColor(color);
        t.setFill(fill);
        return t;
    }
}
