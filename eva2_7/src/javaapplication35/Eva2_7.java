/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication35;
import java.util.Scanner;
/**
 *
 * @author bisonte
 */
public class Eva2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int temp;
       Scanner captu = new Scanner(System.in);
       System.out.println("Cual es la temperatura?");
       temp = captu.nextInt();
       if (temp >=35)
           System.out.println("Muy caliente el dia bro");
       else if (temp>=20)
           System.out.println("Es un buen dia");
       else if (temp>=10)
           System.out.println("Ta fresquito");
       else 
           System.out.println("Ice frio hielo :( ");
    }
    
}

               
    
              
    

