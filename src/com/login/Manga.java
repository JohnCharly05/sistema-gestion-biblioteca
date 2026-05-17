/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author jccam
 */
class Manga extends Libro {
    private int numTomos;
    private String dibujante;

    public Manga(String titulo, String genero, String autor, double precioCompra, double precioVenta, int numEjemplares, int numTomos, String dibujante) {
        super(titulo, genero, autor, precioCompra, precioVenta, numEjemplares);
        this.numTomos = numTomos;
        this.dibujante = dibujante;
    }

    public int getNumTomos() {
        return numTomos;
    }

    public void setNumTomos(int numTomos) {
        this.numTomos = numTomos;
    }

    public String getDibujante() {
        return dibujante;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Manga: " + getTitulo() + ", Dibujante: " + dibujante + ", Tomos: " + numTomos);
    }
}