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
public class PersonaGeneral extends Personas {
    private String ocupacion;
    private String horario;
    private int tiempoTrabajado;
    private double sueldo;

    public PersonaGeneral() {
        super();
    }

    public PersonaGeneral(String ocupacion, String horario, int tiempoTrabajado, double sueldo, long ID, String nombre,int edad, String sexo, String estadoCivil, double altura, double peso, ArrayList<String> listaMensaje) {
        super(ID, nombre,edad, sexo, estadoCivil, altura, peso, listaMensaje);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempoTrabajado = tiempoTrabajado;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempoTrabajado() {
        return tiempoTrabajado;
    }

    public void setTiempoTrabajado(int tiempoTrabajado) {
        this.tiempoTrabajado = tiempoTrabajado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
