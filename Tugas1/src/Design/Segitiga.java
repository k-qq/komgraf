/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 *
 * @author W8
 */
public class Segitiga extends javax.swing.JFrame {

    /**
     * Creates new form Segitiga
     */
     int x1, y1, x2, y2, x3, y3, degree, she, grid = 20, wSize = 480 /2;
     float skala;
     int XT,YT;

    public Segitiga() {
        initComponents();
        jScrollPane2.setViewportView(new Koordinat());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        xa = new javax.swing.JTextField();
        ya = new javax.swing.JTextField();
        xb = new javax.swing.JTextField();
        yb = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        xc = new javax.swing.JTextField();
        yc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        x = new javax.swing.JTabbedPane();
        sumbuX = new javax.swing.JButton();
        sumbuY = new javax.swing.JButton();
        sumbuxy = new javax.swing.JButton();
        munculTitik = new javax.swing.JButton();
        buatSegi3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        xt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yt = new javax.swing.JTextField();
        translasiSegi3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        shear = new javax.swing.JTextField();
        xShear = new javax.swing.JButton();
        yShear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        sudut = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rotasi = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        scale = new javax.swing.JTextField();
        sk = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton7.setText("Sumbu Y");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Points");

        xb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbActionPerformed(evt);
            }
        });

        Hapus.setText("Clear");
        Hapus.setFocusable(false);
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        jLabel14.setText("X1");

        jLabel15.setText("Y1");

        jLabel16.setText("X2");

        jLabel17.setText("Y2");

        Back.setText("Back");
        Back.setFocusable(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Instruction", 1, 48)); // NOI18N
        jLabel18.setText("TRIANGLE");

        xc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xcActionPerformed(evt);
            }
        });

        jLabel1.setText("Y3");

        jLabel2.setText("X3");

        sumbuX.setText("Sumbu X");
        sumbuX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbuXActionPerformed(evt);
            }
        });
        x.addTab("Sumbu X", sumbuX);

        sumbuY.setText("Sumbu Y");
        sumbuY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbuYActionPerformed(evt);
            }
        });
        x.addTab("Sumbu Y", sumbuY);

        sumbuxy.setText("Sumbu X = Y");
        sumbuxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbuxyActionPerformed(evt);
            }
        });
        x.addTab("Sumbu X = Y", sumbuxy);

        munculTitik.setText("Show Point");
        munculTitik.setFocusable(false);
        munculTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munculTitikActionPerformed(evt);
            }
        });

        buatSegi3.setText("Show Triangle");
        buatSegi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatSegi3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Reflection");

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jLabel4.setText("XT");

        jLabel5.setText("YT");

        yt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ytActionPerformed(evt);
            }
        });

        translasiSegi3.setText("Translate");
        translasiSegi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translasiSegi3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(xt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(yt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(translasiSegi3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(translasiSegi3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Translation", jPanel1);

        xShear.setText("X");
        xShear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xShearActionPerformed(evt);
            }
        });

        yShear.setText("Y");
        yShear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yShearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(xShear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yShear)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xShear)
                    .addComponent(yShear))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Shear", jPanel3);

        jLabel6.setText("Sudut");

        rotasi.setText("Rotate");
        rotasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(sudut, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(rotasi)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sudut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rotasi))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rotation", jPanel4);

        sk.setText("Scale");
        sk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(sk, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sk))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scalling", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x)
                            .addComponent(jSeparator4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(xc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(yc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel17))
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(xb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(yb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(xa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(munculTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buatSegi3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Hapus)
                                        .addGap(41, 41, 41)
                                        .addComponent(Back)))
                                .addGap(12, 12, 12))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(munculTitik))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(buatSegi3))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back)
                            .addComponent(Hapus))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void munculTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munculTitikActionPerformed
        // TODO add your handling code here:
        try {
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());
            try {
                x2 = Integer.parseInt(xb.getText());
                y2 = Integer.parseInt(yb.getText());
                try{
                    x1 = Integer.parseInt(xa.getText());
                    y1 = Integer.parseInt(ya.getText());
                    jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, 1));
                    jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, 1));
                }catch(Exception e){
                    jScrollPane2.setViewportView(new KoorSegitiga(x2, y2, 30, 30, 50, 50, 1));
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_munculTitikActionPerformed

    private void xcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xcActionPerformed

    private void xbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xbActionPerformed

    private void buatSegi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatSegi3ActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xb.getText());
            y2 = Integer.parseInt(yb.getText());
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());
            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, 2));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_buatSegi3ActionPerformed

    private void sumbuXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbuXActionPerformed
        // TODO add your handling code here:
         try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xb.getText());
            y2 = Integer.parseInt(yb.getText());
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());
            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, 4));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_sumbuXActionPerformed

    private void sumbuYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbuYActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xb.getText());
            y2 = Integer.parseInt(yb.getText());
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());
            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, 5));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_sumbuYActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new TitikBidang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        jScrollPane2.setViewportView(new Koordinat());
        xa.setText("");
        ya.setText("");
        xb.setText("");
        yb.setText("");
        xc.setText("");
        yc.setText("");
        xt.setText("");
        yt.setText("");
        shear.setText("");
        sudut.setText("");
        scale.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void sumbuxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbuxyActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xb.getText());
            y2 = Integer.parseInt(yb.getText());
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());
           jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, 6));
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_sumbuxyActionPerformed

    private void skActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skActionPerformed
        // TODO add your handling code here:
        try {
            skala = Float.parseFloat(scale.getText());
            x1 = Integer.parseInt(xa.getText());
            x2 = Integer.parseInt(ya.getText());
            x3 = Integer.parseInt(xb.getText());
            y1 = Integer.parseInt(yb.getText());
            y2 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());

            if (skala > 0) {

                //                    jScrollPane2.setViewportView(new KoorSegitiga((int)(skala * x1 * grid + wSize), (int)(wSize - grid * y1 * skala),
                    //                            (int)(skala * x2 * grid + wSize), (int)(wSize - grid * y2 * skala),
                    //                            (int)(skala * x3 * grid + wSize), (int)(wSize - grid * y3 * skala), skala, 9));

            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, Math.abs(skala), 9));
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_skActionPerformed

    private void rotasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotasiActionPerformed
        // TODO add your handling code here:
        try{
            degree = Integer.parseInt(sudut.getText());
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xb.getText());
            y2 = Integer.parseInt(yb.getText());
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());
            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, degree, 8));
        }catch(Exception e){

        }
    }//GEN-LAST:event_rotasiActionPerformed

    private void yShearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yShearActionPerformed
        // TODO add your handling code here:
        try{
            she = Integer.parseInt(shear.getText());
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText()); //+ she * x1;
            x2 = Integer.parseInt(xb.getText());
            y2 = Integer.parseInt(yb.getText()); //+ she * x2;
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText()); //+ she * x3;
            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, 0, she, 7));
        }catch(Exception e){

        }
    }//GEN-LAST:event_yShearActionPerformed

    private void xShearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xShearActionPerformed
        // TODO add your handling code here:
        try{
            she = Integer.parseInt(shear.getText());
            x1 = Integer.parseInt(xa.getText()); //+ she * y1;
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xb.getText()); //+ she * y2;
            y2 = Integer.parseInt(yb.getText());
            x3 = Integer.parseInt(xc.getText()); //+ she * y3;
            y3 = Integer.parseInt(yc.getText());
            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, she, 0, 7));
        }catch(Exception e){

        }
    }//GEN-LAST:event_xShearActionPerformed

    private void translasiSegi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translasiSegi3ActionPerformed
        // TODO add your handling code here:
        try{
            x1 = Integer.parseInt(xa.getText());
            y1 = Integer.parseInt(ya.getText());
            x2 = Integer.parseInt(xb.getText());
            y2 = Integer.parseInt(yb.getText());
            x3 = Integer.parseInt(xc.getText());
            y3 = Integer.parseInt(yc.getText());
            XT = Integer.parseInt(xt.getText());
            YT = Integer.parseInt(yt.getText());
            jScrollPane2.setViewportView(new KoorSegitiga(x1, y1, x2, y2, x3, y3, XT, YT, 3));
        }catch(Exception e){

        }
    }//GEN-LAST:event_translasiSegi3ActionPerformed

    private void ytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ytActionPerformed
 
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
            java.util.logging.Logger.getLogger(Segitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Segitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Segitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Segitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segitiga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton buatSegi3;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton munculTitik;
    private javax.swing.JButton rotasi;
    private javax.swing.JTextField scale;
    private javax.swing.JTextField shear;
    private javax.swing.JButton sk;
    private javax.swing.JTextField sudut;
    private javax.swing.JButton sumbuX;
    private javax.swing.JButton sumbuY;
    private javax.swing.JButton sumbuxy;
    private javax.swing.JButton translasiSegi3;
    private javax.swing.JTabbedPane x;
    private javax.swing.JButton xShear;
    private javax.swing.JTextField xa;
    private javax.swing.JTextField xb;
    private javax.swing.JTextField xc;
    private javax.swing.JTextField xt;
    private javax.swing.JButton yShear;
    private javax.swing.JTextField ya;
    private javax.swing.JTextField yb;
    private javax.swing.JTextField yc;
    private javax.swing.JTextField yt;
    // End of variables declaration//GEN-END:variables
}
