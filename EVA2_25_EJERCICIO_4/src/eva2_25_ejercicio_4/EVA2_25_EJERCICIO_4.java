/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_25_EJERCICIO_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = captu.nextInt();
        captu.nextLine();
        System.out.println("Introduce la potencia: ");
        int expo = captu.nextInt();
        captu.nextLine();
        int resultado = 1;
        for(int i = 1; i <= expo; i++){
            resultado *= base;
        }
        System.out.println("Resultado: " + base + "elevado a la" + expo + " = " + resultado);
    }
    
}
