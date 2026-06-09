package dominio;

import java.io.Serializable;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;


public class Tarifa implements Serializable {

    private static String [][] tarifas = setTarifas();
    
    
    
 
    
 public static void imprimirMatriz(String[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}   
 public static int valorActual (String departamento, int peso) 
 {
        int valorActual = 0;
        String zona = ""+ obtenerZona(departamento).charAt(0);
        int cat = 0;
        
        if (peso < 1000 ){cat = 1;}
        else {if (peso < 5000 ){cat = 2;}
        else {if (peso < 10000 ){cat = 3;}
        else{cat = 4;}}}
        
        
        for (int i = 0 ; i < tarifas.length ; i ++)
        {
        
          if (tarifas[i][0].equals(zona))
          {
            valorActual = Integer.parseInt(tarifas[i][cat]);
          }
       }
        return valorActual;
  }
// SPLIT LO SAQUE DE CHATGPT, CREO QUE NO LO VIMOS EN CLASE
public static String [][] setTarifas() {
    
    String [][] tarifas = new String [4][5];
    String [] datosPorZona = leerArchivo();
    String [] aux = new String [4];
    
    for (int i = 0; i < tarifas.length; i++) {
        
          int posNumeral = datosPorZona[i].indexOf('#');  
          aux = datosPorZona[i].substring(posNumeral + 1).split(",");
          
          tarifas [i][0] = ""+datosPorZona[i].charAt(0);
          tarifas [i][1] = aux [0];
          tarifas [i][2] = aux [1];
          tarifas [i][3] = aux [2];
          tarifas [i][4] = aux [3];
      }
    return tarifas;
}
    
    
public static String[] leerArchivo() {
    String[] datosPorZona = new String[4];

    try {
        Scanner arch = new Scanner(Paths.get("archivo.txt"));

        int contador = 0;

        while (arch.hasNextLine()) {
            datosPorZona[contador] = arch.nextLine();
            contador++;
        }

        arch.close();

    } catch (IOException e) {
        System.out.println("Error al leer el archivo");
    }

    return datosPorZona;
}
    
  public static String obtenerZona(String departamento) {
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
    
      
    
    
}
