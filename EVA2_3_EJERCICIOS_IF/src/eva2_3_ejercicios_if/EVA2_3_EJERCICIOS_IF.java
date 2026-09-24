/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_3_EJERCICIOS_IF {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double precio, canti, sub, total, desc = 0;
        System.out.println("Cual es el precio?");
        precio = input.nextDouble();
        System.out.println("Cual es la cantidad?");
        canti = input.nextDouble();
        sub = precio * canti;
        if (sub >= 1000) {
            desc = sub * 0.1;
        } 
        total = sub - desc;
        System.out.println("Subtotal = " + sub);
        System.out.println("Descuento = " + desc);
        System.out.println("Total = " + total);
    }
    
}
