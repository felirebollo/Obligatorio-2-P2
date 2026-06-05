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
public class Funcionario extends Persona implements Serializable{

    private int numeroFuncionario;
    private int añoIngreso;


    public Funcionario(String nombre, String celular, int numeroFuncionario, int añoIngreso) {

        super(nombre, celular);
        this.setNumeroFuncionario(numeroFuncionario);
        this.setAñoIngreso(añoIngreso);
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int anioIngreso) {
        this.añoIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
