/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_24_EJERCICIO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner (System.in);
       System.out.println("Indica el numero a contar de asteriscos: ");
       int num= captu.nextInt();
       captu.nextLine();
       for(int i = 1; i <= num; i++){
           for (int j = 1; j <= i; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
}
