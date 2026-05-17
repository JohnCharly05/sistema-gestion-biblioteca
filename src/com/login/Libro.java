/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author jccam
 */
public abstract class Libro {
    private String titulo;
    private String genero;
    private String autor;
    private double precioCompra;
    private double precioVenta;
    private int numEjemplares;

    // Constructor
    public Libro(String titulo, String genero, String autor, double precioCompra, double precioVenta, int numEjemplares) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.numEjemplares = numEjemplares;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    // Método abstracto
    public abstract void mostrarDetalles();
}

