/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS_1_0;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class RENEW extends javax.swing.JFrame {

    /**
     * Creates new form RENEW
     */
    public RENEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_login = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btn_back = new javax.swing.JTextField();
        btn_addbook = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btn_close = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_studentid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        S2 = new javax.swing.JSeparator();
        txt_title = new javax.swing.JTextField();
        txt_isbn = new javax.swing.JTextField();
        txt_publisher = new javax.swing.JTextField();
        txt_category = new javax.swing.JTextField();
        txt_Price = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_login.setBackground(new java.awt.Color(0, 255, 255));
        lbl_login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(153, 153, 153));
        lbl_login.setText("Renew");
        jPanel1.add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 10));

        jSeparator2.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 200, 8, 320));

        jSeparator3.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 10, 400));

        jSeparator4.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 10, 220));

        jSeparator5.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator5.setForeground(new java.awt.Color(0, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 10, 110));

        btn_back.setEditable(false);
        btn_back.setBackground(new java.awt.Color(21, 21, 21));
        btn_back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 255, 255));
        btn_back.setText("         Back");
        btn_back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 140, 30));

        btn_addbook.setEditable(false);
        btn_addbook.setBackground(new java.awt.Color(21, 21, 21));
        btn_addbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_addbook.setForeground(new java.awt.Color(0, 255, 255));
        btn_addbook.setText("         Renew");
        btn_addbook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        btn_addbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addbookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addbookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_addbookMouseExited(evt);
            }
        });
        jPanel1.add(btn_addbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 140, 30));

        jSeparator6.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator6.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, 10, 400));

        jSeparator7.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator7.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, 8, 320));

        jSeparator8.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, 10, 220));

        jSeparator9.setBackground(new java.awt.Color(21, 21, 21));
        jSeparator9.setForeground(new java.awt.Color(0, 255, 255));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 10, 110));

        jPanel3.setBackground(new java.awt.Color(21, 21, 21));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        btn_close.setEditable(false);
        btn_close.setBackground(new java.awt.Color(21, 21, 21));
        btn_close.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(0, 255, 255));
        btn_close.setText("  X");
        btn_close.setBorder(null);
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("New Book");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS_1_0/IMGS/icons8_Star_Filled_12px_2.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS_1_0/IMGS/icons8_Star_Filled_12px_2.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS_1_0/IMGS/icons8_Star_Filled_12px_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 869, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        txt_studentid.setBackground(new java.awt.Color(21, 21, 21));
        txt_studentid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_studentid.setForeground(new java.awt.Color(204, 204, 204));
        txt_studentid.setText("Student ID");
        txt_studentid.setBorder(null);
        txt_studentid.setMargin(new java.awt.Insets(2, 6, 2, 8));
        txt_studentid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_studentidFocusGained(evt);
            }
        });
        txt_studentid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_studentidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_studentidMouseExited(evt);
            }
        });
        jPanel1.add(txt_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 260, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS_1_0/IMGS/icons8_Search_24px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 30));

        S2.setBackground(new java.awt.Color(21, 21, 21));
        S2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 300, 10));

        txt_title.setBackground(new java.awt.Color(21, 21, 21));
        txt_title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_title.setForeground(new java.awt.Color(204, 204, 204));
        txt_title.setText("Title");
        txt_title.setBorder(null);
        txt_title.setMargin(new java.awt.Insets(2, 6, 2, 8));
        txt_title.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_titleFocusGained(evt);
            }
        });
        txt_title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_titleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_titleMouseExited(evt);
            }
        });
        jPanel1.add(txt_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 290, 30));

        txt_isbn.setBackground(new java.awt.Color(21, 21, 21));
        txt_isbn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_isbn.setForeground(new java.awt.Color(204, 204, 204));
        txt_isbn.setText("ISBN");
        txt_isbn.setBorder(null);
        txt_isbn.setMargin(new java.awt.Insets(2, 6, 2, 8));
        txt_isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_isbnFocusGained(evt);
            }
        });
        txt_isbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_isbnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_isbnMouseExited(evt);
            }
        });
        jPanel1.add(txt_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 280, 30));

        txt_publisher.setBackground(new java.awt.Color(21, 21, 21));
        txt_publisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_publisher.setForeground(new java.awt.Color(204, 204, 204));
        txt_publisher.setText("Publisher");
        txt_publisher.setBorder(null);
        txt_publisher.setMargin(new java.awt.Insets(2, 6, 2, 8));
        txt_publisher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_publisherFocusGained(evt);
            }
        });
        txt_publisher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_publisherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_publisherMouseExited(evt);
            }
        });
        jPanel1.add(txt_publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 290, 30));

        txt_category.setBackground(new java.awt.Color(21, 21, 21));
        txt_category.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_category.setForeground(new java.awt.Color(204, 204, 204));
        txt_category.setText("Category");
        txt_category.setBorder(null);
        txt_category.setMargin(new java.awt.Insets(2, 6, 2, 8));
        txt_category.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_categoryFocusGained(evt);
            }
        });
        txt_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_categoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_categoryMouseExited(evt);
            }
        });
        txt_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_categoryActionPerformed(evt);
            }
        });
        jPanel1.add(txt_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 280, 30));

        txt_Price.setBackground(new java.awt.Color(21, 21, 21));
        txt_Price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Price.setForeground(new java.awt.Color(204, 204, 204));
        txt_Price.setText("Price");
        txt_Price.setBorder(null);
        txt_Price.setMargin(new java.awt.Insets(2, 6, 2, 8));
        txt_Price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_PriceFocusGained(evt);
            }
        });
        txt_Price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_PriceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_PriceMouseExited(evt);
            }
        });
        jPanel1.add(txt_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xy,xx;
    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        dispose();
        HOME H =new HOME();
        H.setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        btn_back.setBackground(new Color(0,204,204));
        btn_back.setForeground(new Color(21,21,21));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        btn_back.setBackground(new Color(21,21,21));
        btn_back.setForeground(new Color(0,204,204));
    }//GEN-LAST:event_btn_backMouseExited

    private void btn_addbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addbookMouseClicked

    }//GEN-LAST:event_btn_addbookMouseClicked

    private void btn_addbookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addbookMouseEntered
        btn_addbook.setBackground(new Color(0,204,204));
        btn_addbook.setForeground(new Color(21,21,21));
    }//GEN-LAST:event_btn_addbookMouseEntered

    private void btn_addbookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addbookMouseExited
        btn_addbook.setBackground(new Color(21,21,21));
        btn_addbook.setForeground(new Color(0,204,204));
    }//GEN-LAST:event_btn_addbookMouseExited

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        btn_close.setBackground(new Color(0,236,239));
        btn_close.setForeground(new Color(21,21,21));
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        btn_close.setBackground(new Color(21,21,21));
        btn_close.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_btn_closeMouseExited

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        setOpacity((float)0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_jPanel3MouseReleased

    private void txt_studentidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_studentidFocusGained
        txt_studentid.setText("");
    }//GEN-LAST:event_txt_studentidFocusGained

    private void txt_studentidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_studentidMouseEntered
        txt_studentid.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_txt_studentidMouseEntered

    private void txt_studentidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_studentidMouseExited
        txt_studentid.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_txt_studentidMouseExited

    private void txt_titleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_titleFocusGained
        txt_title.setText("");
        S2.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_txt_titleFocusGained

    private void txt_titleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_titleMouseEntered
        txt_title.setForeground(new Color(0,236,239));
        S2.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_txt_titleMouseEntered

    private void txt_titleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_titleMouseExited
        txt_title.setForeground(new Color(204,204,204));
        S2.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_titleMouseExited

    private void txt_isbnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_isbnFocusGained
        txt_isbn.setText("");
    }//GEN-LAST:event_txt_isbnFocusGained

    private void txt_isbnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_isbnMouseEntered
        txt_isbn.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_txt_isbnMouseEntered

    private void txt_isbnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_isbnMouseExited
        txt_isbn.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_txt_isbnMouseExited

    private void txt_publisherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_publisherFocusGained
        txt_publisher.setText("");
    }//GEN-LAST:event_txt_publisherFocusGained

    private void txt_publisherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_publisherMouseEntered
        txt_publisher.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_txt_publisherMouseEntered

    private void txt_publisherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_publisherMouseExited
        txt_publisher.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_txt_publisherMouseExited

    private void txt_categoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_categoryFocusGained
        txt_publisher.setText("");
    }//GEN-LAST:event_txt_categoryFocusGained

    private void txt_categoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_categoryMouseEntered
        txt_publisher.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_txt_categoryMouseEntered

    private void txt_categoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_categoryMouseExited
        txt_publisher.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_txt_categoryMouseExited

    private void txt_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_categoryActionPerformed

    private void txt_PriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_PriceFocusGained
        txt_Price.setText("");
    }//GEN-LAST:event_txt_PriceFocusGained

    private void txt_PriceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PriceMouseEntered
        txt_Price.setForeground(new Color(0,236,239));
    }//GEN-LAST:event_txt_PriceMouseEntered

    private void txt_PriceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PriceMouseExited
        txt_Price.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_txt_PriceMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RENEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RENEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator S2;
    private javax.swing.JTextField btn_addbook;
    private javax.swing.JTextField btn_back;
    private javax.swing.JTextField btn_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JTextField txt_Price;
    private javax.swing.JTextField txt_category;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_publisher;
    private javax.swing.JTextField txt_studentid;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables
}
