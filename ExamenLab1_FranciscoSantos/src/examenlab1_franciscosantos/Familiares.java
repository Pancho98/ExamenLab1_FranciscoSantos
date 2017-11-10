/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_franciscosantos;

import java.util.ArrayList;

/**
 *
 * @author Francisco Santos
 */
public class Familiares extends Personas{
    private String rol;
    private String trabajo;
    private double altura;
    private double peso;
    private ArrayList<Objetos> objetos = new ArrayList();

    public Familiares() {
        super();
    }

    public Familiares(String rol, String trabajo, double altura, double peso) {
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public Familiares(String rol, String trabajo, double altura, double peso, String nombre, int edad, int id, String sexo, String estado, String usuario, String contraseña) {
        super(nombre, edad, id, sexo, estado, usuario, contraseña);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Objetos> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objetos> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "Familiar\n"
                +super.getNombre()+ " rol= " + rol;
    }
    
    
}
