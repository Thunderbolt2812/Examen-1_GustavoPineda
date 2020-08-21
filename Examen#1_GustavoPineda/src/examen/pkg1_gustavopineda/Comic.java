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
public class Comic extends Articulos {
    private int volumen;
    private String desc;
    private int estado;

    public Comic() {
        super();
    }

    public Comic(int volumen, String desc, int estado, String titulo, Color color, String descripcion, String editorial, int tamaño, int puntuacion, Personas persona) {
        super(titulo, color, descripcion, editorial, tamaño, puntuacion, persona);
        this.volumen = volumen;
        this.desc = desc;
        this.estado = estado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return desc;
    }
    
    
}
