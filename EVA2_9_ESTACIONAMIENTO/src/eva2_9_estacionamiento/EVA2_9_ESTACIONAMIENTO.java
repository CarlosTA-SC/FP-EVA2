/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de horas (numero entero positivo): ");
        
        if (scanner.hasNextInt()) {
            int horas = scanner.nextInt();
            
            if (horas <= 0) {
                System.out.println("Error: Por favor, ingrese un numero mayor que 0.");
            } else {
                int costoTotal = 0;
                
                if (horas <= 2) {
                    costoTotal = horas * 25;
                } else if (horas <= 5) {
                    costoTotal = horas * 20;
                } else if (horas <= 10) {
                    costoTotal = horas * 15;
                } else {
                    costoTotal = 150; 
                }
                
                System.out.println("Para " + horas + " hora(s), el costo total es: $" + costoTotal);
            }
        } else {
            System.out.println("Error: Debe ingresar un numero entero valido.");
        }
    }
    
}
