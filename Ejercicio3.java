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
public class Ejercicio3 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
   
        String x;
        float nota;
        System.out.println ( "Introduce tu nombre: " );
        x = teclado.nextLine();
        System.out.println("Introduce tu nota: ");
        nota = teclado.nextFloat();
        //System.out.println(x.toUpperCase() + ((nota >=5) ? " es APTO": " NO es APTO"));
        
        if (nota>=5){
            System.out.println(x.toUpperCase() + " es APTO");
        }else{
            System.out.println(x.toUpperCase() + " NO es APTO");
        }
    }
}
