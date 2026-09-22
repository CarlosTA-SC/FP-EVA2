/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;
import java.util.*;
/**
 *
 * @author carlos
 */
public class EVA2_2_CALIFAS {
    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cali;
        System.out.println("Cual es tu calificacion?");
        cali = input.nextInt();
        if (cali >= 70) {
            System.out.println("Pasas we");
        } else {
            System.out.println("No pasas we");
        }
    }
}
