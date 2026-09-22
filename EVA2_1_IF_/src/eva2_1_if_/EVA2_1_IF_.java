/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if_;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author carlos
 */
public class EVA2_1_IF_ {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int edad;
        System.out.println("Cual es tu edad?");
        edad = input.nextInt();
        if (edad >= 18) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }
    
}
