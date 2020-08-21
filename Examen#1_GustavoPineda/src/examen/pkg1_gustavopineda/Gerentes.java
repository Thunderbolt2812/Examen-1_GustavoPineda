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
public class Gerentes extends Personas {
    private String usuario;
    private String contraseña;

    public Gerentes() {
        super();
    }

    public Gerentes(String usuario, String contraseña, long ID, String nombre, String sexo, String estadoCivil, double altura, double peso, ArrayList<String> listaMensaje) {
        super(ID, nombre, sexo, estadoCivil, altura, peso, listaMensaje);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    @Override
    public String toString() {
        return usuario;
    }
    
    
}
