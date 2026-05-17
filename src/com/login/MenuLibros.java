package com.login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MenuLibros extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    public static int columnas, filas;
    public static float total = 0;
    Connection connection;
    Statement statement = null;
    ResultSet resultSet = null;
    DefaultTableModel modelo, modeloL;
    int idc, fila = -1, list = 0, filaL = -1, cod;
    float mont = 0, imp = 0;
    Object[][] listaC = new Object[3][10];
    String title, aut, gen, tipo;
    //ArrayList<ArrayList<Object>> listaC = new ArrayList<>();
    Conexion con = new Conexion();
    public static Object[][] tableData;
    public static ArrayList<Manga> herenciaManga = new ArrayList<>();
    public static ArrayList<NovelaLigera> herenciaNovela = new ArrayList<>();
    String tipoLibro, dibujante, tipoNovela;
    Float precioCompra;
    int numE;
    //public static String hola = "hola Mundo";

    public MenuLibros() {
        initComponents();
        conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        menuLibros = new javax.swing.JLabel();
        btnregresar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        btnAniadir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logopanini.png"))); // NOI18N
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 280, 90));

        header.setBackground(new java.awt.Color(234, 233, 165));
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

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

        exitTxt.setBackground(new java.awt.Color(204, 204, 204));
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
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuLibros.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        menuLibros.setText("MENU DE LIBROS");

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

        jLabel8.setBackground(new java.awt.Color(51, 153, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cerrar_sesion__2___1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout btnregresarLayout = new javax.swing.GroupLayout(btnregresar);
        btnregresar.setLayout(btnregresarLayout);
        btnregresarLayout.setHorizontalGroup(
            btnregresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnregresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnregresarLayout.setVerticalGroup(
            btnregresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnregresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLibros)
                .addGap(16, 16, 16))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLibros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnregresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        jLabel1.setBackground(new java.awt.Color(234, 233, 165));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/mangas.png"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 160, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/SOLO NOVELAS.png"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 130, 90));

        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Libro", "Titulo del libro", "Precio individual"
            }
        ));
        tablaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLista);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 490, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/CUENTIRIJILLOS (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 130, -1));

        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("Ingrese titulo del libro");
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituloMousePressed(evt);
            }
        });
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        bg.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 140, -1));

        autor.setForeground(new java.awt.Color(204, 204, 204));
        autor.setText("Ingrese autor");
        autor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                autorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                autorMousePressed(evt);
            }
        });
        autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorActionPerformed(evt);
            }
        });
        bg.add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 130, -1));

        genero.setForeground(new java.awt.Color(204, 204, 204));
        genero.setText("Ingrese género");
        genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generoMousePressed(evt);
            }
        });
        bg.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 120, -1));

        btnAniadir.setBackground(new java.awt.Color(228, 226, 226));
        btnAniadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAniadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAniadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAniadirMouseExited(evt);
            }
        });

        jLabel5.setText("AÑADIR LIBRO A LA LISTA");

        javax.swing.GroupLayout btnAniadirLayout = new javax.swing.GroupLayout(btnAniadir);
        btnAniadir.setLayout(btnAniadirLayout);
        btnAniadirLayout.setHorizontalGroup(
            btnAniadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAniadirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btnAniadirLayout.setVerticalGroup(
            btnAniadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAniadirLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bg.add(btnAniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 180, 60));

        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });

        jLabel6.setText("REGISTRAR PAGO");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bg.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 150, 50));

        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });

        jLabel7.setText("CANCELAR COMPRA");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
        );

        bg.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 150, 60));

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. de tomo", "Titulo"
            }
        ));
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaLibros);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 430));

        jLabel9.setText("Titulo del libro");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel10.setText("Autor");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel11.setText("Tipo:");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 30, -1));

        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        jLabel12.setText("ELIMINAR DE LA LISTA");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 150, 60));

        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        jLabel13.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 150, 50));

        jLabel14.setText("Precio");
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        lPrecio.setText("$");
        lPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(lPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 80, -1));

        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });

        jLabel15.setText("LIMPIAR CAMPOS");

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel15)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void tituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMousePressed
        if (titulo.getText().equals("Ingrese titulo del libro")) {
            titulo.setText("");
            titulo.setForeground(Color.black);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloMousePressed

    private void autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorActionPerformed

    private void autorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autorMousePressed
        if (autor.getText().equals("Ingrese autor")) {
            autor.setText("");
            autor.setForeground(Color.black);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_autorMousePressed

    private void generoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoMousePressed
        if (genero.getText().equals("Ingrese género")) {
            genero.setText("");
            genero.setForeground(Color.black);
        }     // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_generoMousePressed

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        if (titulo.getText().equals("")) {
            titulo.setText("Ingrese titulo del libro");
            titulo.setForeground(Color.gray);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_tituloMouseExited

    private void autorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autorMouseExited
        if (autor.getText().equals("")) {
            autor.setText("Ingrese autor");
            autor.setForeground(Color.gray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_autorMouseExited

    private void generoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoMouseExited
        if (genero.getText().equals("")) {
            genero.setText("Ingrese género");
            genero.setForeground(Color.gray);
        }       // TODO add your handling code here:
    }//GEN-LAST:event_generoMouseExited

    private void btnAniadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAniadirMouseClicked
        btnAniadir.setBackground(new Color(235, 232, 24));// TODO add your handling code here:
        añadirHerencias();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun libro");
        } else {
            Object[] lista = new Object[3];
            modeloL = (DefaultTableModel) tablaLista.getModel();
            lista[0] = idc;
            lista[1] = title;
            lista[2] = mont;
            modeloL.addRow(lista);
            tablaLista.setModel(modeloL);
            //total = total + mont;
        }
    }//GEN-LAST:event_btnAniadirMouseClicked

    private void btnAniadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAniadirMouseEntered
        btnAniadir.setBackground(new Color(235, 232, 24));   // TODO add your handling code here:
    }//GEN-LAST:event_btnAniadirMouseEntered

    private void btnAniadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAniadirMouseExited
        btnAniadir.setBackground(new Color(242, 242, 242));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAniadirMouseExited

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        btnRegistrar.setBackground(new Color(235, 232, 24));   // Pagos
        tableData = getTableData(tablaLista);

        /*
     for (Object[] row : tableData) {
            for (Object cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
         */
        sumar();
        //añadirHerencias();
        // System.out.println(total);
        metodo_pago metodo = new metodo_pago();
        metodo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(new Color(235, 232, 24));     // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(242, 242, 242));       // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        btnCancelar.setBackground(new Color(235, 13, 0));      // TODO add your handling code here:
        modeloL.setRowCount(0);
        herenciaManga.clear();
        herenciaNovela.clear();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(235, 13, 0));     // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(242, 242, 242));         // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnregresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseClicked
    btnregresar.setBackground(new Color(92, 148, 237));    // TODO add your handling code here:
    Login log = new Login();
    log.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnregresarMouseClicked

    private void btnregresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseEntered
   btnregresar.setBackground(new Color(92, 148, 237));    // TODO add your handling code here:
    }//GEN-LAST:event_btnregresarMouseEntered

    private void btnregresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregresarMouseExited
btnregresar.setBackground(new Color(204, 255, 255));        // TODO add your handling code here:
    }//GEN-LAST:event_btnregresarMouseExited

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
exitBtn.setBackground(new Color(204, 204, 204));      // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnMouseExited

    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked
        // TODO add your handling code here:
        cod = 0;
        int found = 0;
        fila = tablaLibros.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(null, "No se selecciono ningun libro");
        } else{
            try {
                idc = Integer.parseInt((String) tablaLibros.getValueAt(fila, 0).toString()); 
                String tituloL =  tablaLibros.getValueAt(fila, 1).toString();
                statement = connection.createStatement();
                String sql = "SELECT * FROM mangas";
                resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                    cod = resultSet.getInt("numTom");
                    title = resultSet.getString("titulo");
                    aut = resultSet.getString("autorManga");
                    gen = resultSet.getString("genero");
                    mont = resultSet.getFloat("precioVenta");
                    precioCompra = resultSet.getFloat("precioCompra");
                    dibujante = resultSet.getString("dibujante");
                    numE = resultSet.getInt("numEjemplares");
                    //tipo = resultSet.getString("tipo_Lib");
                    if(idc == cod){
                        titulo.setForeground(Color.black);
                        titulo.setText(title);
                        autor.setText(aut);
                        genero.setText(gen);
                        lPrecio.setText(String.valueOf(mont));
                        found = 1;
                        tipoLibro = "Manga";
                        //añadirHerencias();
                        /*
                        if(tipo.equalsIgnoreCase("Cuento")){
                            cbTipo.setSelectedIndex(1);
                        } else if(tipo.equalsIgnoreCase("Novela")){
                            cbTipo.setSelectedIndex(2);
                        } else if(tipo.equalsIgnoreCase("Manga")){
                            cbTipo.setSelectedIndex(3);
                        }
                        */
                        //JOptionPane.showMessageDialog(null, "Funciono");
                        break;
                    }
                }
                if (found == 0){
                String sql2 = "SELECT * FROM novelas";
                resultSet = statement.executeQuery(sql2);
                while(resultSet.next()){
                    cod = resultSet.getInt("numVol");
                    title = resultSet.getString("titulo");
                    aut = resultSet.getString("autor");
                    gen = resultSet.getString("genero");
                    mont = resultSet.getFloat("precioVenta");
                    precioCompra = resultSet.getFloat("precioCompra");
                    tipoNovela = resultSet.getString("tipoNovela");
                    numE = resultSet.getInt("numEjemplares");
                    //tipo = resultSet.getString("tipo_Lib");
                    if(tituloL.equals(title)){
                        titulo.setForeground(Color.black);
                        titulo.setText(title);
                        autor.setText(aut);
                        genero.setText(gen);
                        lPrecio.setText(String.valueOf(mont));
                        tipoLibro = "Novela";
                        /*
                        if(tipo.equalsIgnoreCase("Cuento")){
                            cbTipo.setSelectedIndex(1);
                        } else if(tipo.equalsIgnoreCase("Novela")){
                            cbTipo.setSelectedIndex(2);
                        } else if(tipo.equalsIgnoreCase("Manga")){
                            cbTipo.setSelectedIndex(3);
                        }
                        */
                        //JOptionPane.showMessageDialog(null, "Funciono");
                        break;
                    }
                }
                }
            } catch (SQLException ex) {
                Logger.getLogger(MenuLibros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tablaLibrosMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        String tipoEliminar = "";
        int m = 0, n = 0;
        int posEliminar = 0;
        if (filaL == -1) {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun libro");
        } else {
            for (Manga book : herenciaManga) {
                if ((book.getTitulo()).equals(tablaLista.getValueAt(filaL, 1).toString())){
                    System.out.println("Manga");
                    tipoEliminar = "Manga";
                    posEliminar = m;
                    //herenciaManga.remove(m);
                }
                m++;
            }
            
            for (NovelaLigera novel : herenciaNovela){
                if ((novel.getTitulo()).equals(tablaLista.getValueAt(filaL, 1).toString())){
                    System.out.println("Novela");
                    tipoEliminar = "Novela";
                    //herenciaNovela.remove(n);
                    posEliminar = n;
                }
                n++;
            }
            if (tipoEliminar.equals("Manga")){
                herenciaManga.remove(posEliminar);
            } else{
                herenciaNovela.remove(posEliminar);
            }
            
            modeloL.removeRow(filaL);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void tablaListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaMouseClicked
        // TODO add your handling code here:
        filaL = tablaLista.getSelectedRow();
        if(filaL == -1){
            JOptionPane.showMessageDialog(null, "No se selecciono ningun libro");
        }
    }//GEN-LAST:event_tablaListaMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        modelo.setRowCount(0);
        String sql = "SELECT titulo, numTom FROM mangas";
        imprimirTabla(sql);
        String consult = "SELECT titulo, numVol FROM novelas";
        imprimirTabla2(consult);
        
        //imprimirTabla(sql);
        genero.setText("Ingrese género");
            genero.setForeground(Color.gray);
            titulo.setText("Ingrese titulo del libro");
            titulo.setForeground(Color.gray);
            autor.setText("Ingrese autor");
            autor.setForeground(Color.gray);
            lPrecio.setText("$");
            //cbTipo.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String tituloL, genL, autL, tipoL, sql;
        tituloL = titulo.getText();
        genL = genero.getText();
        autL = autor.getText();
        //tipoL = String.valueOf(cbTipo.getSelectedItem());
        if (tituloL.equals("Ingrese titulo del libro") && genL.equals("Ingrese género") && autL.equals("Ingrese autor")) {
            JOptionPane.showMessageDialog(null, "Ingresa en un campo valido");
        } else if (genL.equals("Ingrese género") && autL.equals("Ingrese autor")){
            modelo.setRowCount(0);
            sql = "SELECT titulo, numTom FROM mangas where titulo like '%" + tituloL + "%'";
            imprimirTabla(sql);
            if (modelo.getRowCount() == 0){
                sql = "SELECT titulo, numVol FROM novelas where titulo like '%" + tituloL + "%'";
            imprimirTabla2(sql);
            }
        } else if (tituloL.equals("Ingrese titulo del libro") && genL.equals("Ingrese género")){
            modelo.setRowCount(0);
            sql = "SELECT titulo, numTom FROM mangas where autorManga like '%" + autL + "%'";
            imprimirTabla(sql);
            if (modelo.getRowCount() == 0){
                sql = "SELECT titulo, numVol FROM novelas where autor like '%" + autL + "%'";
            imprimirTabla2(sql);
            }
        } else if (tituloL.equals("Ingrese titulo del libro") && autL.equals("Ingrese autor")){
            modelo.setRowCount(0);
            sql = "SELECT titulo, numTom FROM mangas where genero like '%" + genL + "%'";
            imprimirTabla(sql);
            if (modelo.getRowCount() == 0){
                sql = "SELECT titulo, numVol FROM novelas where genero like '%" + genL + "%'";
            imprimirTabla2(sql);
            }
        } 
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(235, 232, 24));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        // TODO add your handling code here:
        btnLimpiar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        btnBuscar.setBackground(new Color(235, 232, 24));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        btnBuscar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        // TODO add your handling code here:
        btnEliminar.setBackground(new Color(235, 13, 0)); 
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
        btnEliminar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_btnEliminarMouseExited

    public void conectar(){
        connection = con.getCon();
        String sql = "SELECT titulo, numTom FROM mangas";
        imprimirTabla(sql);
        String consult = "SELECT titulo, numVol FROM novelas";
        imprimirTabla2(consult);
        /*
        try {
            //connection = con.getCon();
            statement = connection.createStatement();
            String sql = "SELECT codLibro, nom_Lib FROM Libros";
            resultSet = statement.executeQuery(sql);
            Object[] libro = new Object[2];
            modelo = (DefaultTableModel) tablaLibros.getModel();
            while(resultSet.next()){
                libro[0] = resultSet.getInt("codLibro");
                libro[1] = resultSet.getString("nom_Lib");
                modelo.addRow(libro);
            }
            tablaLibros.setModel(modelo);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        */
    }
    
    public void imprimirTabla(String sql){
        try {
            statement = connection.createStatement();
            //String sql = "SELECT codLibro, nom_Lib FROM Libros";
            resultSet = statement.executeQuery(sql);
            Object[] libro = new Object[2];
            modelo = (DefaultTableModel) tablaLibros.getModel();
            while(resultSet.next()){
                libro[0] = resultSet.getInt("numTom");
                libro[1] = resultSet.getString("titulo");
                modelo.addRow(libro);
            }
            tablaLibros.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void imprimirTabla2(String sql){
        try {
            statement = connection.createStatement();
            //String sql = "SELECT codLibro, nom_Lib FROM Libros";
            resultSet = statement.executeQuery(sql);
            Object[] libro = new Object[2];
            modelo = (DefaultTableModel) tablaLibros.getModel();
            while(resultSet.next()){
                libro[0] = resultSet.getInt("numVol");
                libro[1] = resultSet.getString("titulo");
                modelo.addRow(libro);
            }
            tablaLibros.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MenuLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object[][] getTableData(JTable table) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        Object[][] data = new Object[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                data[i][j] = model.getValueAt(i, j);
            }
        }
        return data;
    }
    
    public void sumar(){
        columnas = modeloL.getRowCount();
        filas = modeloL.getColumnCount();
        //System.out.println(columnas);
        for (int i = 0; i < columnas; i++) {
            total = total + (float) tableData[i][2];
        }
    }

    public void añadirHerencias() {
        if (tipoLibro.equals("Manga")){
        herenciaManga.add(new Manga(title, gen, aut, (double) precioCompra, (double) mont, numE, cod, dibujante));
        } else if (tipoLibro.equals("Novela")){
            herenciaNovela.add(new NovelaLigera(title, gen, aut, (double) precioCompra, (double) mont, numE, tipoNovela, cod));
        }
        //Libro vector[0] = new Manga(title, gen, aut, (double) mont, (double) mont, 7, cod, "Dibujante");
        /*
        for(Manga book: herenciaManga){
            System.out.println(book.getDibujante());
        }
        */
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
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnAniadir;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel btnregresar;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JTextField genero;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JLabel menuLibros;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JTable tablaLista;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
