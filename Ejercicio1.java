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
public class Ejercicio1 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in) ;
        int x;
        System.out.println("Introduce un número: ");
        x = teclado.nextInt();
        System.out.println("El doble de " + x + " es " + x*2);
        System.out.println("El triple de " + x + " es " + x*3);
  
           
    }
}
