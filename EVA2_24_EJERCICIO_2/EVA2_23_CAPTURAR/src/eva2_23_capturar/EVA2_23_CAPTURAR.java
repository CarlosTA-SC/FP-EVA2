/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_23_CAPTURAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant, califa;
        double promedio;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuantas calificaciones vas a capturar?");
        cant = captu.nextInt();
        captu.nextLine();
        for(int i = 1; i <= cant; i++){
            System.out.println("Captura la calificacion: ");
            califa = captu.nextInt();
            captu.nextLine();
        }
    }
    
}
