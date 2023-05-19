package GUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class PaintWindow extends javax.swing.JFrame {

    private static PaintWindow p = null;
    int delCount = 0;

    private PaintWindow() {
        initComponents();
        myBoard.DrawTemp = new ArrayList<>();
        myBoard.Modytemp = new ArrayList<>();
    }

    public static PaintWindow getInstance() {
        if (p == null) {
            p = new PaintWindow();
        }
        return p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myBoard = new GUI.Board();
        red = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        pink = new javax.swing.JButton();
        lightGreen = new javax.swing.JButton();
        green = new javax.swing.JButton();
        cyan = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        violet = new javax.swing.JButton();
        black = new javax.swing.JButton();
        grey = new javax.swing.JButton();
        brown = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        Clear1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lineButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rectButton = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        Resize = new javax.swing.JButton();
        triangleButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        Move = new javax.swing.JButton();
        Copy = new javax.swing.JButton();
        fillCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myBoard.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout myBoardLayout = new javax.swing.GroupLayout(myBoard);
        myBoard.setLayout(myBoardLayout);
        myBoardLayout.setHorizontalGroup(
            myBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        myBoardLayout.setVerticalGroup(
            myBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        red.setBackground(new java.awt.Color(255, 51, 51));
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });

        yellow.setBackground(new java.awt.Color(255, 255, 102));
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });

        pink.setBackground(new java.awt.Color(255, 102, 204));
        pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkActionPerformed(evt);
            }
        });

        lightGreen.setBackground(new java.awt.Color(51, 255, 51));
        lightGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightGreenActionPerformed(evt);
            }
        });

        green.setBackground(new java.awt.Color(0, 153, 51));
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });

        cyan.setBackground(new java.awt.Color(153, 255, 255));
        cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanActionPerformed(evt);
            }
        });

        blue.setBackground(new java.awt.Color(0, 51, 255));
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });

        violet.setBackground(new java.awt.Color(153, 0, 153));
        violet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                violetActionPerformed(evt);
            }
        });

        black.setBackground(new java.awt.Color(0, 0, 0));
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });

        grey.setBackground(new java.awt.Color(153, 153, 153));
        grey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyActionPerformed(evt);
            }
        });

        brown.setBackground(new java.awt.Color(153, 102, 0));
        brown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brownActionPerformed(evt);
            }
        });

        orange.setBackground(new java.awt.Color(255, 204, 0));
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });

        undo.setFont(new java.awt.Font("Work Sans", 3, 12)); // NOI18N
        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_211838_undo_icon_24px.png"))); // NOI18N
        undo.setText("UNDO");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        redo.setFont(new java.awt.Font("Work Sans", 3, 12)); // NOI18N
        redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_211811_redo_icon_24px.png"))); // NOI18N
        redo.setText("REDO");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        Clear1.setFont(new java.awt.Font("Work Sans", 3, 9)); // NOI18N
        Clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_330399_bad_cancel_clear_close_decline_icon_20px.png"))); // NOI18N
        Clear1.setText("Clear");
        Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel1.setText("Drawing Section");

        lineButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        lineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_64144_draw_line_icon_32px.png"))); // NOI18N
        lineButton.setText("       line");
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel2.setText("Modyfing Section");

        rectButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        rectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_85342_rectangle_rounded_icon_24px.png"))); // NOI18N
        rectButton.setText(" Rectangle");
        rectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectButtonActionPerformed(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_2931168_bin_delete_remove_trash_garbage_icon_24px.png"))); // NOI18N
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        circleButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        circleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_85302_circle_icon_24px.png"))); // NOI18N
        circleButton.setText("       Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        Resize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_4634432_content_interface_resize_scale_icon_24px.png"))); // NOI18N
        Resize.setToolTipText("");
        Resize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResizeActionPerformed(evt);
            }
        });

        triangleButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        triangleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_85349_triangle_icon_24px.png"))); // NOI18N
        triangleButton.setText("  Triangle");
        triangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleButtonActionPerformed(evt);
            }
        });

        squareButton.setFont(new java.awt.Font("Work Sans", 3, 11)); // NOI18N
        squareButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_85347_square_icon_24px.png"))); // NOI18N
        squareButton.setText("     Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_227577_move_icon_24px.png"))); // NOI18N
        Move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveActionPerformed(evt);
            }
        });

        Copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/iconfinder_3671751_copy_icon_24px.png"))); // NOI18N
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });

        fillCheckBox.setText("Fill the Shape");
        fillCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(undo)
                        .addGap(2, 2, 2)
                        .addComponent(redo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brown, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grey, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(violet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cyan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lightGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pink, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(triangleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(circleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fillCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Resize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lineButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(circleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(triangleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(squareButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fillCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Move)
                            .addComponent(Resize)
                            .addComponent(Copy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(red, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yellow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lightGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(green, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cyan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(violet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(black, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {redo, undo});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        myBoard.setCurrentcolor(Color.red);
    }//GEN-LAST:event_redActionPerformed
    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        myBoard.setCurrentcolor(Color.yellow);
    }//GEN-LAST:event_yellowActionPerformed
    private void pinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkActionPerformed
        myBoard.setCurrentcolor(Color.pink);
    }//GEN-LAST:event_pinkActionPerformed
    private void lightGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightGreenActionPerformed
        Color c = new Color(51, 255, 51);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_lightGreenActionPerformed
    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        myBoard.setCurrentcolor(Color.green);
    }//GEN-LAST:event_greenActionPerformed
    private void cyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyanActionPerformed
        myBoard.setCurrentcolor(Color.cyan);
    }//GEN-LAST:event_cyanActionPerformed
    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        myBoard.setCurrentcolor(Color.blue);
    }//GEN-LAST:event_blueActionPerformed
    private void violetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_violetActionPerformed
        Color c = new Color(153, 0, 153);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_violetActionPerformed
    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        myBoard.setCurrentcolor(Color.black);
    }//GEN-LAST:event_blackActionPerformed
    private void greyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyActionPerformed
        Color c = new Color(153, 153, 153);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_greyActionPerformed
    private void brownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brownActionPerformed
        Color c = new Color(153, 102, 0);
        myBoard.setCurrentcolor(c);
    }//GEN-LAST:event_brownActionPerformed
    private void orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeActionPerformed
        myBoard.setCurrentcolor(Color.orange);
    }//GEN-LAST:event_orangeActionPerformed
    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed

        if (myBoard.getMode() < 5 || !myBoard.Modify) {
            if (myBoard.shapes.size() - 1 >= 0) {
                myBoard.DrawTemp.add(myBoard.shapes.get(myBoard.shapes.size() - 1));
                myBoard.shapes.remove(myBoard.shapes.size() - 1);
                repaint();
            }
        } else if (myBoard.getMode() >= 5 && myBoard.Modify) {
            if (!myBoard.Modytemp.isEmpty()) {
                if (myBoard.getMode() > 5) {
                    int x = myBoard.Indexs.size();
                    if (x - 1 >= 0) {
                        myBoard.shapes.remove((int) myBoard.Indexs.get(x - 1));
                        myBoard.Indexs.remove(x - 1);
                    }
                }
                myBoard.shapes.add(myBoard.Modytemp.get(myBoard.Modytemp.size() - 1));
                myBoard.Modytemp.remove(myBoard.Modytemp.size() - 1);
                delCount++;
                repaint();
            }
            if (myBoard.Modytemp.isEmpty()) {
                myBoard.Modify = false;
            }

        }
    }//GEN-LAST:event_undoActionPerformed
    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed

        if (myBoard.getMode() < 5 || !myBoard.Modify) {
            if (!myBoard.DrawTemp.isEmpty()) {
                myBoard.shapes.add(myBoard.DrawTemp.get(myBoard.DrawTemp.size() - 1));
                myBoard.DrawTemp.remove(myBoard.DrawTemp.size() - 1);
                repaint();
            }
        } else if (myBoard.getMode() >= 5 && myBoard.Modify) {
            if (!myBoard.shapes.isEmpty()) {
                if (delCount > 0) {
                    myBoard.Modytemp.add(myBoard.shapes.get(myBoard.shapes.size() - 1));
                    myBoard.shapes.remove(myBoard.shapes.size() - 1);
                    delCount--;
                    repaint();
                }
            }
            if (myBoard.Modytemp.isEmpty()) {
                myBoard.Modify = false;
            }
        }
    }//GEN-LAST:event_redoActionPerformed

    private void Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear1ActionPerformed
        myBoard.setMode(-1);
        Collections.reverse(myBoard.shapes);
        myBoard.DrawTemp.addAll(myBoard.shapes);
        myBoard.shapes.clear();
        repaint();
    }//GEN-LAST:event_Clear1ActionPerformed

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        myBoard.setMode(0);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void rectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtonActionPerformed
        myBoard.setMode(1);
    }//GEN-LAST:event_rectButtonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        myBoard.setMode(5);
    }//GEN-LAST:event_DeleteActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        myBoard.setMode(2);
    }//GEN-LAST:event_circleButtonActionPerformed

    private void ResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResizeActionPerformed
        myBoard.setMode(6);
    }//GEN-LAST:event_ResizeActionPerformed

    private void triangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleButtonActionPerformed
        myBoard.setMode(3);
    }//GEN-LAST:event_triangleButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        myBoard.setMode(4);
    }//GEN-LAST:event_squareButtonActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        myBoard.setMode(8);
    }//GEN-LAST:event_CopyActionPerformed

    private void fillCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillCheckBoxActionPerformed
        if (fillCheckBox.isSelected()) {
            myBoard.setFill(true);
        } else {
            myBoard.setFill(false);
        }
    }//GEN-LAST:event_fillCheckBoxActionPerformed

    private void MoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveActionPerformed
        myBoard.setMode(7);
    }//GEN-LAST:event_MoveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear1;
    private javax.swing.JButton Copy;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Move;
    private javax.swing.JButton Resize;
    private javax.swing.JButton black;
    private javax.swing.JButton blue;
    private javax.swing.JButton brown;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton cyan;
    private javax.swing.JCheckBox fillCheckBox;
    private javax.swing.JButton green;
    private javax.swing.JButton grey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lightGreen;
    private javax.swing.JButton lineButton;
    private GUI.Board myBoard;
    private javax.swing.JButton orange;
    private javax.swing.JButton pink;
    private javax.swing.JButton rectButton;
    private javax.swing.JButton red;
    private javax.swing.JButton redo;
    private javax.swing.JButton squareButton;
    private javax.swing.JButton triangleButton;
    private javax.swing.JButton undo;
    private javax.swing.JButton violet;
    private javax.swing.JButton yellow;
    // End of variables declaration//GEN-END:variables
}
