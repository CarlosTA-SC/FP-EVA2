/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
        int resultado = 1;
        System.out.println("=== CALCULADORA DE FACTORIAL ===");
        System.out.print("Ingresa un número entero positivo: ");
        int numero = captu.nextInt();
        
        if (numero < 0) {
            System.out.println("Error: El factorial no existe para números negativos.");
        } else if (numero == 0 || numero == 1) {
            System.out.println("El factorial de " + numero + " es: 1");
        } else {

            for (int i = 1; i <= numero; i++) {
                resultado = resultado * i;
            }
            
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
    }
}
