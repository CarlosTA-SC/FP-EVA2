/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, credencial;
        Scanner captu = new Scanner (System.in);
        System.out.println("Tienes credencial? (1 = si, 0 = no):");
        credencial = captu.nextInt();
        if (credencial == 1){
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }
}
