/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE VERIFICACIÓN DE DESCUENTO EN AUTOBÚS ===");
        
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        boolean aplicaDescuento = false;
        String motivoDescuento = "";

        if (edad < 18) {
            aplicaDescuento = true;
            motivoDescuento = "Descuento por menor de edad";
        } else if (edad >= 60) {
            System.out.print("¿Cuenta con credencial vigente del INSEN/INAPAM? (s/n): ");
            char tieneInsen = scanner.next().toLowerCase().charAt(0);

            if (tieneInsen == 's') {
                aplicaDescuento = true;
                motivoDescuento = "Descuento para adultos mayores (INSEN/INAPAM)";
            }
        } else {
            System.out.print("¿Es estudiante con credencial vigente? (s/n): ");
            char tieneCredencialEstudiante = scanner.next().toLowerCase().charAt(0);

            if (tieneCredencialEstudiante == 's') {
                aplicaDescuento = true;
                motivoDescuento = "Descuento de estudiante";
            }
        }

        if (aplicaDescuento) {
            System.out.println("¡APLICA DESCUENTO!");
            System.out.println("Tipo: " + motivoDescuento);
        } else {
            System.out.println("NO APLICA DESCUENTO.");
            System.out.println("Debe pagar la tarifa regular.");
        }
    }
    
}
