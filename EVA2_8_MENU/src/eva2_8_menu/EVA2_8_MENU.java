/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_menu;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class EVA2_8_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner captu = new Scanner (System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>>MENU RESTAURANTE LA CUCHARA CROCANTE<<<<<<<<<<<<<<<<<<<<");
        System.out.println("1. Ventas");
        System.out.println("2. Proveedores");
        System.out.println("3. Empleados");
        System.out.println("4. Inventario");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opcion:");
        opcion = captu.nextInt();
        if (opcion == 1){
            System.out.println("PANTALLA DE VENTAS");
        } else if(opcion == 2){
            System.out.println("PANTALLA DE PROVEEDORES");
        } else if(opcion == 3){
            System.out.println("PANTALLA DE EMPLEADOS");
        } else if(opcion == 4){
            System.out.println("PANTALLA DE INVENTARIO");
        } else if(opcion == 5){
            System.out.println("BYE BYE!!");
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
    
}
