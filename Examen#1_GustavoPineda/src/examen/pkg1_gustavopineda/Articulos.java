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
public class Articulos {
    private String titulo;
    private Color color;
    private String descripcion;
    private String editorial;
    private int tamaño;
    private int puntuacion;
    private Personas persona;

    public Articulos() {
    }

    public Articulos(String titulo, Color color, String descripcion, String editorial, int tamaño, int puntuacion, Personas persona) {
        this.titulo = titulo;
        this.color = color;
        this.descripcion = descripcion;
        this.editorial = editorial;
        this.tamaño = tamaño;
        this.puntuacion = puntuacion;
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
