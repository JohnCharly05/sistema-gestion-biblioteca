package com.login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;



public class venta extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    public static Object[][] listaF = MenuLibros.tableData;
    Connection connection;
    Statement statement = null;
    ResultSet resultSet = null;
    Conexion con = new Conexion();
    int meto = metodo_pago.m;
    DefaultTableModel modelo, modeloL;
    float totalV = MenuLibros.total;
    int colum = MenuLibros.columnas;
    int fil = MenuLibros.filas;
    public static String met = metodo_pago.metodo;
    int numP = 0, totalPago;
    int cambio = 0, totalP, totalCom;
    Login l = new Login();
    int id = l.idE;
    ArrayList<Manga> hm = MenuLibros.herenciaManga;
    ArrayList<NovelaLigera> hn = MenuLibros.herenciaNovela;
    
    LocalDate fechaActual = LocalDate.now(); // Solo la fecha
        LocalTime horaActual = LocalTime.now(); // Solo la hora

        // Formatea la fecha y hora (opcional)
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String fechaFormateada = fechaActual.format(formatoFecha);
        String horaFormateada = horaActual.format(formatoHora);
    
    public venta() {
        initComponents();
        System.out.println(id);
        conectar();
        //imprimirLista();
        imprimirListaH();
        lTotal.setText(String.valueOf(Math.round(totalV)));
        totalPago = Math.round(totalV);
        permitir();
        /*
        for(Manga book: hm){
            System.out.println(hm.size());
            System.out.println(book.getTitulo());
        }
        */
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
        jLabel9 = new javax.swing.JLabel();
        btnimprimir = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listLibros = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lTotal = new javax.swing.JLabel();
        tfPago = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

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
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 280, 90));

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
            .addGap(0, 710, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        jLabel9.setText("Libros vendidos:");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        btnimprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnimprimirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnimprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnimprimirMouseExited(evt);
            }
        });

        jLabel11.setText("IMPRIMIR TICKET");

        javax.swing.GroupLayout btnimprimirLayout = new javax.swing.GroupLayout(btnimprimir);
        btnimprimir.setLayout(btnimprimirLayout);
        btnimprimirLayout.setHorizontalGroup(
            btnimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnimprimirLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btnimprimirLayout.setVerticalGroup(
            btnimprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnimprimirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 140, 40));

        jScrollPane2.setViewportView(listLibros);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, 120));

        jLabel1.setText("Total:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        lTotal.setText("$");
        bg.add(lTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 60, -1));
        bg.add(tfPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, -1));

        jLabel2.setText("Pago:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 40, -1));

        btnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseExited(evt);
            }
        });

        jLabel4.setText("FINALIZAR VENTA");

        javax.swing.GroupLayout btnFinalizarLayout = new javax.swing.GroupLayout(btnFinalizar);
        btnFinalizar.setLayout(btnFinalizarLayout);
        btnFinalizarLayout.setHorizontalGroup(
            btnFinalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFinalizarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        btnFinalizarLayout.setVerticalGroup(
            btnFinalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFinalizarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bg.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseClicked
btnregresar.setBackground(new Color(92, 148, 237));        // TODO add your handling code here:
metodo_pago back = new metodo_pago();
back.setVisible(true);
dispose();
    }//GEN-LAST:event_btnregresarMouseClicked

    private void btnregresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseEntered
btnregresar.setBackground(new Color(92, 148, 237));        // TODO add your handling code here:
    }//GEN-LAST:event_btnregresarMouseEntered

    private void btnregresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseExited
btnregresar.setBackground(new Color(204, 255, 255));        // TODO add your handling code here:
    }//GEN-LAST:event_btnregresarMouseExited

    private void btnimprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnimprimirMouseEntered
btnimprimir.setBackground(new Color(235, 232, 24));        // TODO add your handling code here:
    }//GEN-LAST:event_btnimprimirMouseEntered

    private void btnimprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnimprimirMouseExited
btnimprimir.setBackground(new Color(204, 204, 204));        // TODO add your handling code here:
    }//GEN-LAST:event_btnimprimirMouseExited

    private void btnimprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnimprimirMouseClicked
        btnimprimir.setBackground(new Color(235, 232, 24));        // TODO add your handling code here:
        obtenerId();
        //System.out.println(meto);
        //System.out.println(numP);
        totalP = Integer.parseInt(tfPago.getText());
        Document documento = new Document();
        try {
            
            String ruta = System.getProperty("user.home");
            //String ruta ="C:";
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+ "/Reporte.pdf"));
            documento.open();
            //documento.add(new Paragraph("Hola"));
            documento.add(new Paragraph("Tienda Panini Las Americas"));
            documento.add(new Paragraph("PANINI PLAZA LAS AMERICAS"));
            documento.add(new Paragraph(fechaFormateada + "  " + horaFormateada));
            documento.add(new Paragraph("Cajero: Tienda"));
            documento.add(new Paragraph("Caja NS: CAJA00001"));
            documento.add(new Paragraph("Lista de precios: " + colum));
            documento.add(new Paragraph("No. Ticket " + numP));
            documento.add(new Paragraph(""));
            PdfPTable tabla = new PdfPTable(2);
            tabla.addCell("Concepto");
            tabla.addCell("Importe");
            for (int i = 0; i < colum; i++) {
                tabla.addCell(String.valueOf(listaF[i][1]));
                tabla.addCell(String.valueOf(listaF[i][2]));
            }
            tabla.addCell("Total de unidades");
            tabla.addCell(String.valueOf(colum));
            tabla.addCell("Subtotal");
            tabla.addCell(String.valueOf(totalPago));
            tabla.addCell("GRAN TOTAL");
            tabla.addCell(String.valueOf(totalPago));
            documento.add(tabla);
            documento.add(new Paragraph("Metodo de pago: " + calcularM()));
            documento.add(new Paragraph("Su pago: " + String.valueOf(totalP)));
            documento.add(new Paragraph("Su cambio " + String.valueOf(calcularC())));
            documento.close();
            
            
        } catch (DocumentException | FileNotFoundException e) {

        }
        insertar();
    }//GEN-LAST:event_btnimprimirMouseClicked

    private void btnFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseClicked
        // TODO add your handling code here:
        MenuGeneral menu = new MenuGeneral();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFinalizarMouseClicked

    private void btnFinalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseEntered
        // TODO add your handling code here:
        btnFinalizar.setBackground(new Color(235, 232, 24));
    }//GEN-LAST:event_btnFinalizarMouseEntered

    private void btnFinalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseExited
        // TODO add your handling code here:
        btnFinalizar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnFinalizarMouseExited

    public void conectar(){
        connection = con.getCon();
        String sql = "SELECT numVent, met_pag, monto_pagado FROM Ventas";
        //imprimirTabla(sql);
    }
    
    public void imprimirTabla(String sql){
        try {
            statement = connection.createStatement();
            //String sql = "SELECT codLibro, nom_Lib FROM Libros";
            resultSet = statement.executeQuery(sql);
            Object[] venta = new Object[3];
            //modelo = (DefaultTableModel) tablaVentas.getModel();
            while(resultSet.next()){
                venta[0] = resultSet.getInt("numVent");
                venta[1] = resultSet.getString("met_pag");
                venta[2] = resultSet.getInt("monto_pagado");
                numP = (int) venta[0];
                numP++;
                modelo.addRow(venta);
            }
            //tablaVentas.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void imprimirLista(){
        String [] listaN = new String[colum];
        for (int i = 0; i < colum; i++) {
            listaN[i] = (String)listaF[i][1];
        }
        listLibros.setListData(listaN);
    }
    
    public void imprimirListaH(){
        int i = 0;
        String[] listaH = new String[colum];
        for (Manga listam : hm){
            listaH[i] = listam.getTitulo();
            i++;
        }
        for (NovelaLigera listan : hn){
            listaH[i] = listan.getTitulo();
            i++;
        }
        listLibros.setListData(listaH);
    }
    
    public String calcularM(){
        String metodo = "";
        if (meto == 1){
            metodo = "Efectivo";
        } else if (meto == 2){
            metodo = "Tarjeta";
        } else if (meto == 3){
            metodo = "Transferencia";
        }
        return metodo;
    }
    
    public void permitir(){
        if (meto == 1){
        } else {
            tfPago.setText(String.valueOf(totalPago));
            //System.out.println("Hola");
            //tfPago.setText("100");
            tfPago.setEditable(false);
        }
    }
    
    public float calcularC(){
        cambio = 0;
        totalCom = Integer.parseInt(lTotal.getText());
        totalP = Integer.parseInt(tfPago.getText());
        System.out.println(totalP);
        cambio = totalP - totalCom;
        return cambio;
    }
    
    public void insertar(){
        try {
            String sql = "insert into venta (formaPago, fec) \n values"
                    + "( " + meto +", '" + fechaFormateada + " " + horaFormateada + "');";
            statement = connection.createStatement();
            //String sql = "SELECT codLibro, nom_Lib FROM Libros";
            
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void obtenerId(){
        try {
            String consulta = "select numVent from venta";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(consulta);
            while(resultSet.next()){
                numP = resultSet.getInt("numVent");
                System.out.println(numP);
            }
            numP++;
        } catch (SQLException ex) {
            Logger.getLogger(venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnFinalizar;
    private javax.swing.JPanel btnimprimir;
    private javax.swing.JPanel btnregresar;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lTotal;
    private javax.swing.JList<String> listLibros;
    private javax.swing.JLabel logoname;
    private javax.swing.JTextField tfPago;
    // End of variables declaration//GEN-END:variables
}
