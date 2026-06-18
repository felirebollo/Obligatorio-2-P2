/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.*;

public class Persistencia {

    public static void guardarSistema(Sistema sistema) {
        try {
            ObjectOutputStream salida =
                    new ObjectOutputStream(
                            new FileOutputStream("sistema.dat"));

            salida.writeObject(sistema);
            salida.close();

        } catch (IOException e) {
            System.out.println("Error al guardar");
        }
    }

    public static Sistema cargarSistema() {
        Sistema sistema = null;

        try {
            ObjectInputStream entrada =
                    new ObjectInputStream(
                            new FileInputStream("sistema.dat"));

            sistema = (Sistema) entrada.readObject();
            entrada.close();

        } catch (IOException | ClassNotFoundException e) {
            sistema = new Sistema();
        }

        return sistema;
    }
}