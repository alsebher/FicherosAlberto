/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import manejodearchivos.ManejoDeArchivos;

/**
 *
 * @author Alumno Mañana
 */
public class PPal {
    public static void main(String[] args) {
        String nombreArchivo="prueba.txt";
        ManejoDeArchivos.crearArchivo(nombreArchivo);
        ManejoDeArchivos.escribirArchivo(nombreArchivo, "Escribiendo sobre mi archivo");
        ManejoDeArchivos.agregarArchivo(nombreArchivo, "Agrego info");
        ManejoDeArchivos.leerArchivo(nombreArchivo);
        ManejoDeArchivos.leerArchivoPalabra(nombreArchivo);
    }
}
