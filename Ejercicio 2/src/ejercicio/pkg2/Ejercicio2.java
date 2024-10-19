/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double calificacion1,calificacion2,calificacion3,examen,trabajoClase,promedioParciales,calificacionFinal;
         System.out.println("Ingrese Calificacion 1");  
         calificacion1 = datos.nextDouble();
         System.out.println("Ingrese Calificacion 2"); 
         calificacion2 = datos.nextDouble();
          System.out.println("Ingrese Calificacion 3"); 
          calificacion3 = datos.nextDouble();
          System.out.println("Ingrese calificacion examen final");
          examen = datos.nextDouble();
          System.out.println("Ingrese calificacion trabajo final");
          trabajoClase = datos.nextDouble();
          
          promedioParciales = (calificacion1 + calificacion2 + calificacion3) / 3;
        calificacionFinal = (promedioParciales * 0.55) + (examen * 0.30) + (trabajoClase * 0.15);

        System.out.println(String.format("Calificacion Final: %.2f", calificacionFinal)); 
          
          
          
        // TODO code application logic here
        
    }
    
}
