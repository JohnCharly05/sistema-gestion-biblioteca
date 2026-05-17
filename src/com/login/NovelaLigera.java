/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author jccam
 */
class NovelaLigera extends Libro {
    private String tipoNovela;
    private int numVolumenes;

    public NovelaLigera(String titulo, String genero, String autor, double precioCompra, double precioVenta, int numEjemplares, String tipoNovela, int numVolumenes) {
        super(titulo, genero, autor, precioCompra, precioVenta, numEjemplares);
        this.tipoNovela = tipoNovela;
        this.numVolumenes = numVolumenes;
    }

    public String getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }

    public int getNumVolumenes() {
        return numVolumenes;
    }

    public void setNumVolumenes(int numVolumenes) {
        this.numVolumenes = numVolumenes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Novela Ligera: " + getTitulo() + ", Tipo: " + tipoNovela + ", Volúmenes: " + numVolumenes);
    }
}

