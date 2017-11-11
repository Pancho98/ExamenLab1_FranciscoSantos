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
public class Hogar extends Objetos{
    private int tiempo;
    private String area;
    private String instruccion;
    private String fecha;

    public Hogar() {
        super();
    }

    public Hogar(int tiempo, String area, String instruccion, String fecha) {
        this.tiempo = tiempo;
        this.area = area;
        this.instruccion = instruccion;
        this.fecha = fecha;
    }

    public Hogar(int tiempo, String area, String instruccion, String fecha, Color color, String descripcion, String marca, int tamaño, int calidad, int precio, String dueño) {
        super(color, descripcion, marca, tamaño, calidad, precio, dueño);
        this.tiempo = tiempo;
        this.area = area;
        this.instruccion = instruccion;
        this.fecha = fecha;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Hogar\n"
               +" marca= "+super.getMarca() + " area= " + area;
    }
    
}
