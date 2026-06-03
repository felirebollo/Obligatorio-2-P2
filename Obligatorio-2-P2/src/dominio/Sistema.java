/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Sistema {

    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Paquete> paquetes;
    private ArrayList<Envio> envios;
    private ArrayList<Tarifa> tarifas;

    public Sistema(ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios, ArrayList<Paquete> paquetes, ArrayList<Envio> envios, ArrayList<Tarifa> tarifas) {

        this.setClientes(clientes);
        this.setFuncionarios(funcionarios);
        this.setPaquetes(paquetes);
        this.setEnvios(envios);
        this.setTarifas(tarifas);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(ArrayList<Envio> envios) {
        this.envios = envios;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(ArrayList<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }
    
    
    
    
    
    public void agregarCliente(Cliente cliente) {
        this.getClientes().add(cliente);
    }
    
    public void agregarFuncionario(Funcionario funcionario) {
        this.getFuncionarios().add(funcionario);
    }
    
    public void agregarPaquete(Paquete paquete) {
        this.getPaquetes().add(paquete);
    }
    
    public void agregarEnvio(Envio envio) {
        this.getEnvios().add(envio);
    }   
    
    public void agregarTarifa(Tarifa tarifa) {
        this.getTarifas().add(tarifa);
    }
    
    public Cliente buscarCliente(String correo) {
        Cliente clienteBuscado = null;
        boolean encontrado = false;
        int i = 0;

        while (i < this.getClientes().size() && !encontrado) {
            Cliente cliente = this.getClientes().get(i);

            if (cliente.getCorreo().equals(correo)) {
                clienteBuscado = cliente;
                encontrado = true;
            }

            i = i + 1;
        }

        return clienteBuscado;
    }
    
    public Funcionario buscarFuncionario(int numeroFuncionario) {
        Funcionario funcionarioBuscado = null;
        boolean encontrado = false;
        int i = 0;

        while (i < this.getFuncionarios().size() && !encontrado) {

            Funcionario funcionario = this.getFuncionarios().get(i);

            if (funcionario.getNumeroFuncionario() == numeroFuncionario) {
                funcionarioBuscado = funcionario;
                encontrado = true;
            }
            
            i = i + 1;
        }

        return funcionarioBuscado;
    }
    
    public Paquete buscarPaquete(String identificador) {
        Paquete paqueteBuscado = null;
        boolean encontrado = false;
        int i = 0;

        while (i < this.getPaquetes().size() && !encontrado) {

            Paquete paquete = this.getPaquetes().get(i);

            if (paquete.getIdentificador().equals(identificador)) {
                paqueteBuscado = paquete;
                encontrado = true;
            }

            i = i + 1;
        }

        return paqueteBuscado;
    }
    
    public Tarifa buscarTarifa(String zona) {
        Tarifa tarifaBuscada = null;
        int i = 0;

        while (i < this.getTarifas().size() && tarifaBuscada == null) {

            Tarifa tarifa = this.getTarifas().get(i);

            if (tarifa.getZona().equals(zona)) {
                tarifaBuscada = tarifa;
            }

            i = i + 1;
        }

        return tarifaBuscada;
    }
    
    public Envio buscarEnvio(int numero) {
        Envio envioBuscado = null;
        boolean encontrado = false;
        int i = 0;
    
        while (i < this.getEnvios().size() && !encontrado) {
            Envio envio = this.getEnvios().get(i);
            if (envio.getNumero() == numero) {
                envioBuscado = envio;
                encontrado = true;
            }
            i = i + 1;
            }
        return envioBuscado;
    }  

    public int calcularPrecio(String zona, int pesoGramo){
        Tarifa tarifa = null;
        int precio = 0;
        if(pesoGramo < 1000) {
            precio = tarifa.getPrecioCategoria1();
        } else if(pesoGramo < 5000) {
            precio = tarifa.getPrecioCategoria2();
        } else if(pesoGramo < 10000) {
            precio = tarifa.getPrecioCategoria3();
        } else{
            precio = tarifa.getPrecioCategoria4();
        }
        return precio;
    }
    
    public boolean existeNombre(String nombre) {
        boolean existe = false;
        int i = 0;
        
        while(i < this.getClientes().size() && !existe) {
            if(this.getClientes().get(i).getNombre().equals(nombre)) {
                existe = true;
            }
            i = i+1;
        }
        return existe;
    }
    
    
    
    
}
