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
public class Mensaje {
    private String cuerpo;
    private boolean estado;
    private Personas emisor;
    private Personas Receptor;

    public Mensaje() {
    }

    public Mensaje(String cuerpo, boolean estado, Personas emisor, Personas Receptor) {
        this.cuerpo = cuerpo;
        this.estado = estado;
        this.emisor = emisor;
        this.Receptor = Receptor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Personas getEmisor() {
        return emisor;
    }

    public void setEmisor(Personas emisor) {
        this.emisor = emisor;
    }

    public Personas getReceptor() {
        return Receptor;
    }

    public void setReceptor(Personas Receptor) {
        this.Receptor = Receptor;
    }

    @Override
    public String toString() {
        return "Mensaje: \n"
                +cuerpo;
    }
    
    
}
