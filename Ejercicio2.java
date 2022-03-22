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
public class Ejercicio2 {
    public static void main (String [] args) {
        Scanner a = new Scanner (System.in);
        float kmh;
        double resultado;
        System.out.println("Introduce los KM.H: ");
        kmh = a.nextFloat();
        resultado = kmh*1000/3600;
        System.out.printf("%f KMH en Metros Por Segundo es %f: " , kmh, resultado );
        
    }
}
