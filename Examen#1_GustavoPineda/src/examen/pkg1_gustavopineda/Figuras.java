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
    private String intrucciones;
    private String garantia;

    public Figuras() {
        super();
    }

    public Figuras(String descrip, String intrucciones, String garantia, String titulo, Color color, String descripcion, String editorial, int tamaño, int puntuacion, Personas persona) {
        super(titulo, color, descripcion, editorial, tamaño, puntuacion, persona);
        this.descrip = descrip;
        this.intrucciones = intrucciones;
        this.garantia = garantia;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getIntrucciones() {
        return intrucciones;
    }

    public void setIntrucciones(String intrucciones) {
        this.intrucciones = intrucciones;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return super.getDescripcion();
    }
    
    
}
