/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_15_BECA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int promedio, salPapas;
       Scanner captu = new Scanner (System.in);
        System.out.println("Coloca tu promedio:");
        promedio = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuanto ganan tus papas al mes?");
        salPapas = captu.nextInt();
        if ((promedio >= 80) && (salPapas >= 10000)){
            System.out.println("Puedes pasar por tu beca");
        } else {
            System.out.println("No puedes pasar por la beca");
        }
    }
    
}
