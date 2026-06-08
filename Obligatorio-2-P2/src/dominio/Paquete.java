package dominio;

import java.io.Serializable;


public class Paquete implements Serializable{

    private String identificador;
    private Cliente cliente;
    private String fecha;
    private String destinatario;
    private String direccion;
    private String departamento;
    private int pesoGramos;
    private int precio;
    private String estado;

 
    public Paquete(String identificador, Cliente cliente, String fecha, String destinatario, String direccion, String departamento, int pesoGramos, int precio, String estado) {

        this.setIdentificador(identificador);
        this.setCliente(cliente);
        this.setFecha(fecha);
        this.setDestinatario(destinatario);
        this.setDireccion(direccion);
        this.setDepartamento(departamento);
        this.setPesoGramos(pesoGramos);
        this.setPrecio(precio);
        this.setEstado(estado);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return this.getIdentificador();
    }
}
