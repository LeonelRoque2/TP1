/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packClases;

import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author Administrador
 */
public class PrimeraClase {
    int unEntero;
    String unaCadena;
    public void mostrar(){
        System.out.println("Los atributos de los objetos creados son: " +unaCadena + " y " +unEntero);        
    }
    public static void main(String[] args) {
        
        
        PrimeraClase unObjeto1 = new PrimeraClase();
        PrimeraClase unObjeto2 = new PrimeraClase();
        PrimeraClase unObjeto3 = new PrimeraClase();
        PrimeraClase unObjeto4 = new PrimeraClase();
        PrimeraClase unObjeto5 = new PrimeraClase();
        
        unObjeto1.unaCadena = "Ventilador";
        unObjeto1.unEntero = 5;
        unObjeto2.unaCadena = "Pizarra";
        unObjeto2.unEntero = 3;
        unObjeto3.unaCadena = "Pantallas";
        unObjeto3.unEntero = 2;
        unObjeto4.unaCadena = "Proyector";
        unObjeto4.unEntero = 1;
        unObjeto5.unaCadena = "PCs";
        unObjeto5.unEntero = 20;
        
//        unObjeto1.mostrar();
//        unObjeto2.mostrar();
//        unObjeto3.mostrar();
//        unObjeto4.mostrar();
//        unObjeto5.mostrar();
        
        ArrayList <PrimeraClase> primeraclase = new ArrayList <>();
        primeraclase.add(unObjeto1);
        primeraclase.add(unObjeto2);
        primeraclase.add(unObjeto3);
        primeraclase.add(unObjeto4);
        primeraclase.add(unObjeto5);
        
        for (PrimeraClase p : primeraclase) {
            p.mostrar();
        }
          
        
        System.out.printf("PROGRAMACIÓN II");
    }
}
