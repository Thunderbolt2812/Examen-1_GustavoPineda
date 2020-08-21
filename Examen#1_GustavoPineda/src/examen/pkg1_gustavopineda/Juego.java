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
public class Juego extends Articulos {
    private int edicion;
    private String casaElaboracion;
    private String pais;

    public Juego() {
        super();
    }

    public Juego(int edicion, String casaElaboracion, String pais, String titulo, Color color, String descripcion, String editorial, int tamaño, int puntuacion, Personas persona) {
        super(titulo, color, descripcion, editorial, tamaño, puntuacion, persona);
        this.edicion = edicion;
        this.casaElaboracion = casaElaboracion;
        this.pais = pais;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasaElaboracion() {
        return casaElaboracion;
    }

    public void setCasaElaboracion(String casaElaboracion) {
        this.casaElaboracion = casaElaboracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return casaElaboracion;
    }
    
    
}
