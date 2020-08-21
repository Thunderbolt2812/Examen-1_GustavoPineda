/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_gustavopineda;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Personas {
    private long ID;
    String nombre;
    private String sexo;
    private String estadoCivil;
    private double altura;
    private double peso;
    private ArrayList<String> listaMensaje;

    public Personas() {
    }

    public Personas(long ID, String nombre, String sexo, String estadoCivil, double altura, double peso, ArrayList<String> listaMensaje) {
        this.ID = ID;
        this.nombre = nombre;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
        this.listaMensaje = listaMensaje;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public ArrayList<String> getListaMensaje() {
        return listaMensaje;
    }

    public void setListaMensaje(ArrayList<String> listaMensaje) {
        this.listaMensaje = listaMensaje;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
