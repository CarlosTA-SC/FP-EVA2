/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_4_EJERCICIOS_IF {
        private static final Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom;
        double sal, bono = 0, salfin;
        System.out.println("Cual es el nombre del empleado?");
        nom = input.nextLine();
        System.out.println("Cual es su salario mensual?");
        sal = input.nextDouble();
        if (sal <= 12000) {
            bono = sal * 0.1;
        } else {
            bono = sal * 0.05;
        }
        salfin = sal + bono;
        System.out.println("Nombre = " + nom);
        System.out.println("Salario = " + sal);
        System.out.println("Bono = " + bono);
        System.out.println("Salario final = " + salfin);
    }
    
}
