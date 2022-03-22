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
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int A, B, C, D;
        
        System.out.println("El valor de A es: ");
        A = teclado.nextInt();
        System.out.println("El valor de B es: ");
        B = teclado.nextInt();
        System.out.println("El valor de C es: ");
        C = teclado.nextInt();
        System.out.println("El valor de D es: ");
        D = teclado.nextInt();
        //A = (A > B) ? C : D;
        //System.out.println("El valor de A es " + A);
        
        if (A>B){
            System.out.println("El valor de A es " + C);
        }else{
            System.out.println("El valor de A es " + D);
        }
    }
}

