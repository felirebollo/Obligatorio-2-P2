/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */ 
public class Envio implements Serializable {
    private int numero;
    private String fecha;
    private String zona;
    private Funcionario funcionario;
    private ArrayList<Paquete> envios;
    private boolean recepcionRegistrada;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Paquete> getPaquetes() {
        return envios;
    }
    
    public void agregarEnvio (Paquete paquete)
    {envios.add(paquete) ;}

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.envios = paquetes;
    }

    public boolean isRecepcionRegistrada() {
        return recepcionRegistrada;
    }

    public void setRecepcionRegistrada(boolean recepcionRegistrada) {
        this.recepcionRegistrada = recepcionRegistrada;
    }

    public Envio(int numero, String fecha, String zona, Funcionario funcionario, ArrayList<Paquete> paquetes, boolean recepcionRegistrada) {
        this.setNumero(numero);
        this.setFecha(fecha);
        this.setZona(zona);
        this.setFuncionario(funcionario);
        this.setPaquetes(paquetes);
        this.setRecepcionRegistrada(recepcionRegistrada);
    }

    @Override
    public String toString() {
        return "Envio " + this.getNumero();
    }
    
    public void confirmarRecepcion(ArrayList<Paquete> entregados){
        int i = 0;
        while(i < this.getPaquetes().size()) {
            Paquete p = this.getPaquetes().get(i);
            if(entregados.contains(p)){
                p.setEstado("RECIBIDO");
            } else{
                p.setEstado("PENDIENTE");
            }
            i = i + 1;
        }
        this.setRecepcionRegistrada(true);
    }
    
}
