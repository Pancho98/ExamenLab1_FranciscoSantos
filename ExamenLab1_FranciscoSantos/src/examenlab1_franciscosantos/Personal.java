/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab1_franciscosantos;

/**
 *
 * @author Francisco Santos
 */
public class Personal extends Personas{
   private String ocupacion;
   private String entrada;
   private String Salida;
   private int tiempoTrabajando;
   private int sueldo;

    public Personal() {
        super();
    }

    public Personal(String ocupacion, String entrada, String Salida, int tiempoTrabajando, int sueldo) {
        this.ocupacion = ocupacion;
        this.entrada = entrada;
        this.Salida = Salida;
        this.tiempoTrabajando = tiempoTrabajando;
        this.sueldo = sueldo;
    }

    public Personal(String ocupacion, String entrada, String Salida, int tiempoTrabajando, int sueldo, String nombre, int edad, int id, String sexo, String estado, String usuario, String contraseña) {
        super(nombre, edad, id, sexo, estado, usuario, contraseña);
        this.ocupacion = ocupacion;
        this.entrada = entrada;
        this.Salida = Salida;
        this.tiempoTrabajando = tiempoTrabajando;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public int getTiempoTrabajando() {
        return tiempoTrabajando;
    }

    public void setTiempoTrabajando(int tiempoTrabajando) {
        this.tiempoTrabajando = tiempoTrabajando;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
   
}
