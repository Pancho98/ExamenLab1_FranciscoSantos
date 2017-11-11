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
public class Zapatos extends Objetos{
    private String talla;
    private String suela;
    private int confort;

    public Zapatos() {
        super();
    }

    public Zapatos(String talla, String suela, int confort) {
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

    public Zapatos(String talla, String suela, int confort, Color color, String descripcion, String marca, int tamaño, int calidad, int precio, String dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "Zapatos\n"
               + "talla= " + talla + ", confort= " + confort;
    }
    
}
