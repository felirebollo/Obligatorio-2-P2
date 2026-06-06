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
public class Tarifa implements Serializable {

    private String zona;
    private int precioCategoria1;
    private int precioCategoria2;
    private int precioCategoria3;
    private int precioCategoria4;

    public Tarifa(String zona, int precioCategoria1, int precioCategoria2, int precioCategoria3, int precioCategoria4) {

        this.setZona(zona);
        this.setPrecioCategoria1(precioCategoria1);
        this.setPrecioCategoria2(precioCategoria2);
        this.setPrecioCategoria3(precioCategoria3);
        this.setPrecioCategoria4(precioCategoria4);
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getPrecioCategoria1() {
        return precioCategoria1;
    }

    public void setPrecioCategoria1(int precioCategoria1) {
        this.precioCategoria1 = precioCategoria1;
    }

    public int getPrecioCategoria2() {
        return precioCategoria2;
    }

    public void setPrecioCategoria2(int precioCategoria2) {
        this.precioCategoria2 = precioCategoria2;
    }

    public int getPrecioCategoria3() {
        return precioCategoria3;
    }

    public void setPrecioCategoria3(int precioCategoria3) {
        this.precioCategoria3 = precioCategoria3;
    }

    public int getPrecioCategoria4() {
        return precioCategoria4;
    }

    public void setPrecioCategoria4(int precioCategoria4) {
        this.precioCategoria4 = precioCategoria4;
    }

    @Override
    public String toString() {
        return this.getZona();
    }
}
