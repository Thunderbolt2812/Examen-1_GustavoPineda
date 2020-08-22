/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_gustavopineda;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Figuras extends Articulos{
    private String descrip;
    private String instrucciones;
    private String garantia;

    public Figuras() {
        super();
    }

    public Figuras(String descrip, String instrucciones, String garantia, String titulo, Color color, String descripcion, String editorial, int tamaño, int puntuacion, Personas persona) {
        super(titulo, color, descripcion, editorial, tamaño, puntuacion, persona);
        this.descrip = descrip;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
