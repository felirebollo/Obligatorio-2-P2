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
public class Cliente extends Persona implements Serializable {

    private String correo;


    public Cliente(String nombre, String celular, String correo) {
        super(nombre, celular);
        this.setCorreo(correo);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
