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

    public static boolean sonEnterosValidos(String numFuncionario, String añoIngreso) {
    boolean ok = true;

    try {
        int num = Integer.parseInt(numFuncionario);
        int año = Integer.parseInt(añoIngreso);
        if ((num < 0)||(año < 0)){ok = false;}
        } 
       catch (NumberFormatException e) 
       {ok = false;}
     
    
    
    return ok;
}
    @Override
    public String toString() {
        return this.getNombre();
    }
}
