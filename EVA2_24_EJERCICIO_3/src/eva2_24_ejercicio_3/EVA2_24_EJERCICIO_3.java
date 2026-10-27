/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_24_EJERCICIO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = captu.nextInt();
        captu.nextLine();
        for(int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }    
    }
