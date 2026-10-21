/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.println("\nSelecciona una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                int suma = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + suma);
                break;
            case 2:
                int resta = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resta);
                break;
            case 3:
                int multiplicacion = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + multiplicacion);
                break;
            case 4:
                if (num2 != 0) {
                    double division = (double) num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    
}
