
package dominio;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author felipe
 */
public class Sistema extends Observable implements Serializable {

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
    
    public Sistema() {
    this.setClientes(new ArrayList<Cliente>());
    this.setFuncionarios(new ArrayList<Funcionario>());
    this.setPaquetes(new ArrayList<Paquete>());
    this.setEnvios(new ArrayList<Envio>());
    this.setTarifas(new ArrayList<Tarifa>());
}

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
        this.setChanged();
        this.notifyObservers();
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
    this.clientes.add(cliente);
    this.setChanged();
    this.notifyObservers();
    }
    
    public void agregarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        this.setChanged();
        this.notifyObservers();
    }
    
    public void agregarPaquete(Paquete paquete) {
        this.paquetes.add(paquete);
        this.setChanged();
        this.notifyObservers();
    }
    
    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
        this.setChanged();
        this.notifyObservers();
    }   
    
    public void agregarTarifa(Tarifa tarifa) {
        this.tarifas.add(tarifa);
        this.setChanged();
        this.notifyObservers();
    }
    // NO QUISE CAMBIAR PERO ME PARECER QUE PIDE CONTROLAR SOLO EL NOMBRE
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
    
    public boolean existeIdPaquete(String id) {
        
        boolean existe = false;
        int i = 0;

        while (i < this.getPaquetes().size() && !existe) {

            Paquete paquete = this.getPaquetes().get(i);

            if (paquete.getIdentificador().equals(id)) {
                 existe = true;
            }

            i = i + 1;
        }

        return existe;
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

       
  
    public boolean existeNombre(String nombreNuevo) {
        
        boolean existe = false;
        
          
        int i = 0;
        while (i < this.getClientes().size() && !existe) {

            if (this.getClientes().get(i).getNombre().equalsIgnoreCase(nombreNuevo)) {
                existe = true;
            }
            i = i + 1;
        }

        i = 0;
        while (i < this.getFuncionarios().size() && !existe) {
            if (this.getFuncionarios().get(i).getNombre().equalsIgnoreCase(nombreNuevo)) {
                existe = true;
            }
            i = i + 1;
        }
        
        return existe;
    }
    
    public boolean correoValido(String correo) {

        boolean valido = false;

        if (correo.length() > 5 && correo.contains("@") && correo.substring(correo.length()-4).equalsIgnoreCase(".com")) {
            valido = true;
        }

        return valido;
    }
    
    public boolean existeNombreDistinto(String nombre, String nombreOriginal) {

        boolean existe = false;
        int i = 0;

        while (i < this.getClientes().size() && !existe) {

            Cliente cliente = this.getClientes().get(i);

            if (cliente.getNombre().equals(nombre)
                    && !cliente.getNombre().equals(nombreOriginal)) {

                existe = true;
            }

            i = i + 1;
        }

        i = 0;

        while (i < this.getFuncionarios().size() && !existe) {

            Funcionario funcionario = this.getFuncionarios().get(i);

            if (funcionario.getNombre().equals(nombre)
                    && !funcionario.getNombre().equals(nombreOriginal)) {

                existe = true;
            }

            i = i + 1;
        }

        return existe;
    }

    public int getNumeroEnvio ()
    {
       return this.envios.size()+1;
    }
    
       
    public ArrayList<Paquete> getPaquetesPorZonaEstado (String zona, String estado)
    {
       ArrayList<Paquete> paquetesPorZona = new ArrayList<Paquete>();
        
      for (int i = 0; i < paquetes.size() ; i++)
       {
         if (Tarifa.obtenerZona(paquetes.get(i).getDepartamento()).equalsIgnoreCase(zona) && 
                 paquetes.get(i).getEstado().equalsIgnoreCase(estado))
         {
             paquetesPorZona.add(paquetes.get(i))  ; 
         }
       
       }
        
        return paquetesPorZona;
    
    }
    public int getClientesDiferentesDePaquetesPorEstadoyZona(String zona, String estado)
    {
        int cantidad = 0;

        ArrayList<Paquete> lista = getPaquetesPorZonaEstado(zona, estado);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        for (int i = 0; i < lista.size(); i++)
        {
            Cliente cliente = lista.get(i).getCliente();

            if (!clientes.contains(cliente))
            {
                clientes.add(cliente);
            }
        }

        cantidad = clientes.size();

        return cantidad;
    }
    
    public ArrayList<String> getDepartamentosDePaquetesPorZonayEstado(String zona, String estado)
    {
        ArrayList<String> departamentos = new ArrayList<String>();

        ArrayList<Paquete> lista = getPaquetesPorZonaEstado(zona, estado);

        for (int i = 0; i < lista.size(); i++)
        {
            String departamento = lista.get(i).getDepartamento();

            if (!departamentos.contains(departamento))
            {
                departamentos.add(departamento);
            }
        }

        return departamentos;
    }
}
