/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_24_EJERCICIO_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1, num2;
       Scanner captu = new Scanner (System.in);
       System.out.println("Indica el primer numero a contar: ");
       num1= captu.nextInt();
       captu.nextLine();
       System.out.println("Captura tu segundo numero: ");
       num2 = captu.nextInt();
       captu.nextLine();
       String resultado = "";
       for(int i= num1; i <= num2; i++){
           if (i == num2){
               resultado += i;
           } else {
               resultado += i + " - ";
           }
       }
       System.out.println(resultado);
    }
    
}
