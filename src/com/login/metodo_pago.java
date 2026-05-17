package com.login;

import java.awt.Color;

public class metodo_pago extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    public static String metodo = "";
    public static int m = 0;
    //venta vent = new venta();
    //public static Object[][] lista = MenuLibros.tableData;
    
    public metodo_pago() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logoname = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        btnregresar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnefectivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btntrans = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btntd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("Panini®");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 290, 20));

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logopanini.png"))); // NOI18N
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 280, 90));

        exitBtn.setBackground(new java.awt.Color(255, 0, 51));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnregresar.setBackground(new java.awt.Color(204, 255, 255));
        btnregresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnregresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnregresarMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/5397386.png"))); // NOI18N

        javax.swing.GroupLayout btnregresarLayout = new javax.swing.GroupLayout(btnregresar);
        btnregresar.setLayout(btnregresarLayout);
        btnregresarLayout.setHorizontalGroup(
            btnregresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnregresarLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnregresarLayout.setVerticalGroup(
            btnregresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        btnefectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnefectivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnefectivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnefectivoMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/efectivo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("EFECTIVO");

        javax.swing.GroupLayout btnefectivoLayout = new javax.swing.GroupLayout(btnefectivo);
        btnefectivo.setLayout(btnefectivoLayout);
        btnefectivoLayout.setHorizontalGroup(
            btnefectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnefectivoLayout.createSequentialGroup()
                .addGroup(btnefectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnefectivoLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2))
                    .addGroup(btnefectivoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnefectivoLayout.setVerticalGroup(
            btnefectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnefectivoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        bg.add(btnefectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 300, 140));

        btntrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntransMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntransMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/transferencia.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("TRANSFERENCIA");

        javax.swing.GroupLayout btntransLayout = new javax.swing.GroupLayout(btntrans);
        btntrans.setLayout(btntransLayout);
        btntransLayout.setHorizontalGroup(
            btntransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btntransLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(btntransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        btntransLayout.setVerticalGroup(
            btntransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btntransLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        bg.add(btntrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 300, 160));

        btntd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntdMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/tdc.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("TARJETA CREDITO/DEBITO");

        javax.swing.GroupLayout btntdLayout = new javax.swing.GroupLayout(btntd);
        btntd.setLayout(btntdLayout);
        btntdLayout.setHorizontalGroup(
            btntdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btntdLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel6)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btntdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(42, 42, 42))
        );
        btntdLayout.setVerticalGroup(
            btntdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btntdLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        bg.add(btntd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 300, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void btnefectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnefectivoMouseClicked
btnefectivo.setBackground(new Color(237, 222, 52));        // TODO add your handling code here:
//metodo = "Efectivo";
m = 1;
venta vent = new venta();
vent.setVisible(true);
dispose();
    }//GEN-LAST:event_btnefectivoMouseClicked

    private void btnefectivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnefectivoMouseEntered
     btnefectivo.setBackground(new Color(237, 222, 52));   // TODO add your handling code here:
    }//GEN-LAST:event_btnefectivoMouseEntered

    private void btnefectivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnefectivoMouseExited
btnefectivo.setBackground(new Color(242, 242, 242));        // TODO add your handling code here:
    }//GEN-LAST:event_btnefectivoMouseExited

    private void btntransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransMouseClicked
     btntrans.setBackground(new Color(237, 222, 52));   // TODO add your handling code here:
     //metodo = "Transferencia";
     m = 2;
     venta vent = new venta();
     vent.setVisible(true);
    dispose();
    }//GEN-LAST:event_btntransMouseClicked

    private void btntransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransMouseEntered
btntrans.setBackground(new Color(237, 222, 52));        // TODO add your handling code here:
    }//GEN-LAST:event_btntransMouseEntered

    private void btntransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransMouseExited
btntrans.setBackground(new Color(242, 242, 242));        // TODO add your handling code here:
    }//GEN-LAST:event_btntransMouseExited

    private void btntdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntdMouseClicked
   btntd.setBackground(new Color(237, 222, 52));      // TODO add your handling code here:
   //metodo = "Tarjeta de credito/debito";
   m = 2;
     venta vent = new venta();
   vent.setVisible(true);
    dispose();
    }//GEN-LAST:event_btntdMouseClicked

    private void btntdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntdMouseEntered
btntd.setBackground(new Color(237, 222, 52));         // TODO add your handling code here:
    }//GEN-LAST:event_btntdMouseEntered

    private void btntdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntdMouseExited
        btntd.setBackground(new Color(242, 242, 242));         // TODO add your handling code here:
    }//GEN-LAST:event_btntdMouseExited

    private void btnregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseClicked
        btnregresar.setBackground(new Color(92, 148, 237));        // TODO add your handling code here:
        MenuLibros back = new MenuLibros();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnregresarMouseClicked

    private void btnregresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseEntered
btnregresar.setBackground(new Color(92, 148, 237));        // TODO add your handling code here:
    }//GEN-LAST:event_btnregresarMouseEntered

    private void btnregresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseExited
btnregresar.setBackground(new Color(204, 255, 255));        // TODO add your handling code here:
    }//GEN-LAST:event_btnregresarMouseExited


    
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
            java.util.logging.Logger.getLogger(metodo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(metodo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(metodo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(metodo_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new metodo_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnefectivo;
    private javax.swing.JPanel btnregresar;
    private javax.swing.JPanel btntd;
    private javax.swing.JPanel btntrans;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel logoname;
    // End of variables declaration//GEN-END:variables
}
