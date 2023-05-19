package GUI;

import Classes.Rectangle;
import Classes.Shape;
import Classes.Triangle;
import Classes.Line;
import Classes.Circle;
import Classes.Square;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JPanel implements MouseListener, MouseMotionListener {

    ArrayList<Shape> shapes;
    ArrayList<Shape> DrawTemp;
    ArrayList<Shape> Modytemp;
    ArrayList<Integer> Indexs;
    private Color currentcolor;
    private boolean fill;
    public boolean Modify;
    private int mode = -1;
    private int x1, y1;
    private int x2, y2;
    private int indMove = -1;
    private int indResize = -1;
    private int indCopy = -1;

    public Board() {
        Modify = false;
        shapes = new ArrayList<>();
        Indexs = new ArrayList<>();
        currentcolor = Color.black;
        fill = false;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void setMode(int x) {
        mode = x;
    }

    public int getMode() {
        return mode;
    }

    public void setCurrentcolor(Color c) {
        currentcolor = c;
    }

    public void setFill(boolean b) {
        fill = b;
    }

    public int select(int x, int y) {
        for (int i = shapes.size() - 1; i >= 0; i--) {
            if (shapes.get(i).contains(x, y)) {
                return i;
            }
        }
        JOptionPane.showMessageDialog(this, "Can't find the Object");
        return -1;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Iterator<Shape> it = shapes.iterator();
        while (it.hasNext()) {
            it.next().draw(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        if (mode == 5) {
            int a = select(x1, y1);
            if (a >= 0) {
                Modify = true;
                DrawTemp.clear();
                Modytemp.add(shapes.get(a));
                shapes.remove(a);
                repaint();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (mode < 5) {
            DrawTemp.clear();
            Modytemp.clear();
            Modify = false;
            x1 = e.getX();
            y1 = e.getY();
            switch (mode) {
                case -1:
                    JOptionPane.showMessageDialog(this, "Please,Select a shape");
                    break;
                case 0:
                    Line l = Line.LineCreator(x1, y1, x1, y1, currentcolor, this.fill);
                    shapes.add(l);
                    repaint();
                    break;
                case 1:
                    Rectangle r = Rectangle.rectangleCreator(x1, x1, y1, y1, currentcolor, this.fill);
                    shapes.add(r);
                    repaint();
                    break;
                case 2:
                    Circle c = Circle.circleCreator(x1, y1, x1, y1, currentcolor, this.fill);
                    shapes.add(c);
                    repaint();
                    break;
                case 3:
                    int arrx[] = {x1, x1, x1};
                    int arry[] = {y1, y1, y1};
                    Triangle t = Triangle.TriangleCreator(arrx, arry, currentcolor, this.fill);
                    shapes.add(t);
                    repaint();
                    break;
                case 4:
                    Square s = Square.squareCreator(x1, x2, y1, y2, currentcolor, fill);
                    shapes.add(s);
                    repaint();
                    break;
            }
        } else if (mode > 5) {
            switch (mode) {
                case 6:
                    x1 = e.getX();
                    y1 = e.getY();
                    indResize = select(x1, y1);
                    Shape cpy;
                    try {
                        cpy = (Shape) shapes.get(indResize).clone();
                        Modytemp.add(cpy);
                        Modify = true;
                        Indexs.add(indResize);
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    break;
                case 7:
                    x1 = e.getX();
                    y1 = e.getY();
                    indMove = select(x1, y1);
                    try {
                        cpy = (Shape) shapes.get(indMove).clone();
                        Modytemp.add(cpy);
                        Indexs.add(indMove);
                        Modify = true;
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 8:
                    x1 = e.getX();
                    y1 = e.getY();
                    indCopy = select(x1, y1);
                    if (indCopy >= 0) {
                        Shape x = shapes.get(indCopy);
                        if (x instanceof Line) {
                            Line l = (Line) x;
                            try {
                                Line l1 = (Line) l.clone();
                                shapes.add(l1);
                            } catch (CloneNotSupportedException ex) {
                                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else if (x instanceof Rectangle) {
                            Rectangle l = (Rectangle) x;
                            try {
                                Rectangle r = (Rectangle) l.clone();
                                shapes.add(r);
                            } catch (CloneNotSupportedException ex) {
                                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else if (x instanceof Square) {
                            Square l = (Square) x;
                            try {
                                Square sq = (Square) l.clone();
                                shapes.add(sq);
                            } catch (CloneNotSupportedException ex) {
                                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else if (x instanceof Triangle) {
                            Triangle t = (Triangle) x;
                            try {
                                Triangle t1 = (Triangle) t.clone();
                                shapes.add(t1);
                            } catch (CloneNotSupportedException ex) {
                                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else if (x instanceof Circle) {
                            Circle l = (Circle) x;
                            try {
                                Circle c = (Circle) l.clone();
                                shapes.add(c);
                            } catch (CloneNotSupportedException ex) {
                                Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        mode = 7;
                        indMove = indCopy;
                        repaint();
                    }
                    break;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        Shape s = shapes.get(shapes.size() - 1);
        switch (mode) {
            case -1:
                JOptionPane.showMessageDialog(this, "Please,Select a shape");
                break;
            case 0:
                if (s instanceof Line) {
                    Line l = (Line) s;
                    l.setX2(x2);
                    l.setY2(y2);
                }
                repaint();
                break;
            case 1:
                if (s instanceof Rectangle) {
                    Rectangle r = (Rectangle) s;
                    r.setX2(x2);
                    r.setY2(y2);
                }
                repaint();
                break;
            case 2:
                if (s instanceof Circle) {
                    Circle c = (Circle) s;
                    c.setX2(x2);
                    c.setY2(y2);
                }
                repaint();
                break;
            case 3:
                if (s instanceof Triangle) {
                    Triangle t = (Triangle) s;
                    int tX1 = t.getxArray()[0];
                    int arrx[] = {tX1, x2, tX1};
                    int tY1 = t.getyArray()[0];
                    int arry[] = {tY1, y2, y2};
                    t.setxArray(arrx);
                    t.setyArray(arry);
                }
                repaint();
                break;
            case 4:
                if (s instanceof Square) {
                    Square r = (Square) s;
                    r.setX2(x2);
                    r.setY2(y2);
                }
                repaint();
                break;
            case 6:
                if (indResize >= 0) {
                    Shape x = shapes.get(indResize);
                    x.resize(x2, y2);
                }
                repaint();
                break;
            case 7:
                if (indMove >= 0) {

                    Shape x = shapes.get(indMove);
                    x.move(x2, y2);
                }
                repaint();
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
