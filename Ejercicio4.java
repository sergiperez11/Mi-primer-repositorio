/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo.ejerciciosrefuerzo;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Ejercicio4 {
    public static void main (String [] args) {
        Scanner entero = new Scanner (System.in);
        Scanner  string = new Scanner (System.in);
       
        String d, e;
        int a, b;
        double c;
        double resultado;
        System.out.println ( "Introduce el código del producto: " );
        a = entero.nextInt();
        System.out.println ( "Introduce el artículo: " );
        d = string.nextLine();
        System.out.println ( "Introduce la sección: " );
        e = string.nextLine();
        System.out.println ( "Introduce la temporada: " );
        b = entero.nextInt();
        System.out.println ( "Introduce el precio del producto: " );
        c = string.nextDouble();
        resultado= c*0.60 ; 
        //System.out.printf("Código del producto: %d\n Concepto: %s\n Sección: %s\n Temporada: %d\n Precio: %.2f\n" , a, d, e, b, c);
        //System.out.printf((b < 2019) ? "El precio de la " + d + " rebajada es " + resultado + " euros" : " El producto aún no está rebajado");
        if (b<=2019){
               System.out.println(" El precio de la " + d + " rebajada es " + resultado + " euros" );
        }else{
               System.out.println(" El producto aún no está rebajado" );
        }
        
    }
}
