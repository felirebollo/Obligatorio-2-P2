/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author felipe
 */
public class Funcionario extends Persona {

    private int numeroFuncionario;
    private int anioIngreso;


    public Funcionario(String nombre, String celular, int numeroFuncionario, int anioIngreso) {

        super(nombre, celular);
        this.setNumeroFuncionario(numeroFuncionario);
        this.setAnioIngreso(anioIngreso);
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
}
