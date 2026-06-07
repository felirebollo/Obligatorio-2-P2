package dominio;

import java.io.Serializable;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;


public class Tarifa implements Serializable {

    private String zona;
    private int precioCategoria1;
    private int precioCategoria2;
    private int precioCategoria3;
    private int precioCategoria4;
    private int valor;
    
    
    public Tarifa(String departamento, int peso) {
        
        setValores(obtenerZona(departamento));
        
        if (peso < 1 ){valor = precioCategoria1;}
        else {if (peso < 5 ){valor = precioCategoria2;}
        else {if (peso < 10 ){valor = precioCategoria3;}
        else{valor = precioCategoria4;}}}
        
        
    }
// SPLIT LO SAQUE DE CHATGPT, CREO QUE NO LO VIMOS EN CLASE
public void setValores(String zona) {
    String[] tarifas = leerArchivo();

    for (int i = 0; i < tarifas.length; i++) {

        if (tarifas[i].startsWith("" + zona.charAt(0))) {

            int posicionNumeral = tarifas[i].indexOf('#');

            String precios = tarifas[i].substring(posicionNumeral + 1);

            String[] valores = precios.split(",");
            System.out.println(tarifas[i]);
            precioCategoria1 = Integer.parseInt(valores[0]);
            precioCategoria2 = Integer.parseInt(valores[1]);
            precioCategoria3 = Integer.parseInt(valores[2]);
            precioCategoria4 = Integer.parseInt(valores[3]);
            System.out.println(precioCategoria1);
            System.out.println(precioCategoria2);
            System.out.println(precioCategoria3);
            System.out.println(precioCategoria4);
        }
    }
}
    
    
public String[] leerArchivo() {
    String[] tarifas = new String[4];

    try {
        Scanner arch = new Scanner(Paths.get("archivo.txt"));

        int contador = 0;

        while (arch.hasNextLine() && contador < tarifas.length) {
            tarifas[contador] = arch.nextLine();
            contador++;
        }

        arch.close();

    } catch (IOException e) {
        System.out.println("Error al leer el archivo");
    }

    return tarifas;
}
    
  public String obtenerZona(String departamento) {
    String zona = "";

    departamento = departamento.trim();

    if (departamento.equalsIgnoreCase("Artigas") ||
        departamento.equalsIgnoreCase("Salto") ||
        departamento.equalsIgnoreCase("Paysandú") ||
        departamento.equalsIgnoreCase("Rivera") ||
        departamento.equalsIgnoreCase("Tacuarembó")) {

        zona = "Norte";

    } else if (departamento.equalsIgnoreCase("Río Negro") ||
               departamento.equalsIgnoreCase("Soriano") ||
               departamento.equalsIgnoreCase("Colonia") ||
               departamento.equalsIgnoreCase("San José")) {

        zona = "Oeste";

    } else if (departamento.equalsIgnoreCase("Cerro Largo") ||
               departamento.equalsIgnoreCase("Treinta y Tres") ||
               departamento.equalsIgnoreCase("Lavalleja") ||
               departamento.equalsIgnoreCase("Rocha") ||
               departamento.equalsIgnoreCase("Maldonado")) {

        zona = "Este";

    } else if (departamento.equalsIgnoreCase("Durazno") ||
               departamento.equalsIgnoreCase("Flores") ||
               departamento.equalsIgnoreCase("Florida") ||
               departamento.equalsIgnoreCase("Canelones") ||
               departamento.equalsIgnoreCase("Montevideo")) {

        zona = "Sur";

    } else {
        zona = "Departamento inválido";
    }
    return zona;
}
    
    public int getValor (){
     return valor;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    
    @Override
    public String toString() {
        return this.getZona();
    }
}
