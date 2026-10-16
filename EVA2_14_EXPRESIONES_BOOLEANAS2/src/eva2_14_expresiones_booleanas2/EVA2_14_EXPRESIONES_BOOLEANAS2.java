/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //beca
       //promedio >= 95
       //esta en equipo representativo
       //CAPTURA
       int promedio;
       String equipoRepresenta;
       Scanner captu = new Scanner (System.in);
        System.out.println("Coloca tu promedio:");
        promedio = captu.nextInt();
        captu.nextLine();
        System.out.println("Estas en equipo representativo(S/N)?");
        equipoRepresenta = captu.nextLine();
        if ((promedio >= 95) || equipoRepresenta.equals("S")){
            System.out.println("Puedes pasar por tu beca");
        } else {
            System.out.println("No puedes pasar por la beca");
        }
    }
    
}
