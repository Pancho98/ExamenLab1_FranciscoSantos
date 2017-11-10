/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_franciscosantos;

import java.awt.Color;

/**
 *
 * @author Francisco Santos
 */
public class Objetos {
    private Color color;
    private String descripcion;
    private String marca;
    private int tamaño;
    private int calidad;
    private int precio;
    private Personas dueño;

    public Objetos() {
    }

    public Objetos(Color color, String descripcion, String marca, int tamaño, int calidad, int precio, Personas dueño) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamaño = tamaño;
        this.calidad = calidad;
        this.precio = precio;
        this.dueño = dueño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Personas getDueño() {
        return dueño;
    }

    public void setDueño(Personas dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Objetos\n"
               + "marca=" + marca + ", dueño = " + dueño;
    }
    
}
