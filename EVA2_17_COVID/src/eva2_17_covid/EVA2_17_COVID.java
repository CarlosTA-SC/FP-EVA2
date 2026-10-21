/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("=== EVALUACIÓN DE PERSONA DE RIESGO ANTE COVID-19 ===");

System.out.print("Ingrese la edad de la persona: ");
int edad = scanner.nextInt();

System.out.print("¿Tiene alguna enfermedad crónica (ej. hipertensión, diabetes, asma)? (s/n): ");
boolean tieneEnfermedadCronica = scanner.next().toLowerCase().startsWith("s");

System.out.print("Ingrese el Índice de Masa Corporal (IMC): ");
double imc = scanner.nextDouble();

String motivos = "";

if (edad > 65) motivos += "- Edad mayor a 65 años\n";
if (tieneEnfermedadCronica) motivos += "- Presencia de enfermedad crónica\n";
if (imc >= 25) motivos += "- IMC de 25 o más (sobrepeso u obesidad)\n";

if (!motivos.isEmpty()) {
    System.out.println("RESULTADO: LA PERSONA ES DE RIESGO.\nFactores detectados:\n" + motivos);
} else {
    System.out.println("RESULTADO: NO SE CONSIDERA PERSONA DE RIESGO.\nNo presenta ninguno de los factores evaluados.");
}
    }
    
}
