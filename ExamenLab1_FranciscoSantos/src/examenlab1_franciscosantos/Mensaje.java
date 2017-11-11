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
    private String emisor;
    private String Receptor;

    public Mensaje() {
    }

    public Mensaje(String cuerpo, boolean estado, String emisor, String Receptor) {
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

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    @Override
    public String toString() {
        return "Mensaje: \n"
                +cuerpo;
    }
    
    
}
