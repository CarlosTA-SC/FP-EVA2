/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_booleanas;

/**
 *
 * @author carlos
 */
public class EVA2_13_EXPRESIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean entrarAntro, tieneCredencial = false;
        int edad = 18;
        
        //and(v = 2v)
        entrarAntro = (edad >= 18) && (tieneCredencial == true);
        System.out.println(entrarAntro);
        
        //or(v = 1v)
        boolean estaSoleado = false, tienesDinero = false;
        boolean permisoSalir;
        
        permisoSalir = (estaSoleado == true) || (tienesDinero == true);
        System.out.println("Permiso para salir de paseo: " + permisoSalir);
    }
    
}
