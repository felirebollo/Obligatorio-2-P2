/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author felipe
 */
public abstract class Persona implements Serializable  {

    private String nombre;
    private String celular;

    public Persona(String nombre, String celular) {
        this.setNombre(nombre);
        this.setCelular(celular);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
