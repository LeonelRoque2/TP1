
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Principal {
    public static void main(String[] args) {
        
        int a;
        float b, r=0;
        double c;
        String d;
        
        a=9;
        b=3.14f;
        c=6.28;
        d= "unaCadena";
        
        System.out.println("Los diferentes tipos de datos ingresados son: ");
        System.out.println("Dato entero: " +a);
        System.out.println("Dato float: " +b);
        System.out.println("Dato float: " +c);
        System.out.println("Dato String: " +d); 
        
        ArrayList <Float> lista= new ArrayList<>();
        lista.add(3.14f);
        lista.add(4.18f);
        lista.add(12.8f);
        lista.add(5f);
        
        System.out.println("Los elementos de lista son: ");
        for (int i = 0; i < lista.size(); i++) {
            r= r+lista.get(i);
            System.out.println("" +lista.get(i));
        }
        System.out.println("El promedio de los elementos de lista es: " +(r/lista.size()));
    }
}
