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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        double a;
        char c;

        System.out.println("El valor de n es: ");
        n = teclado.nextInt();
        System.out.println("El valor de a es: ");
        a = teclado.nextDouble();
        System.out.println("El valor de c es: ");
        c = teclado.next().charAt(0);
        System.out.println("La suma de n + a es: " + (n + a));
        System.out.println("La suma de n + a es: " + (a - n));
    }
}
