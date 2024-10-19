/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double base, altura,perimetro, area;
        
        System.out.println("Ingrese altura de rectangulo");
        altura = datos.nextDouble();
        
        
        System.out.println("Ingrese la base del rectangulo");
        base = datos.nextDouble();
        
        perimetro = 2*(base+altura);
        area= base*altura;
                System.out.println("Perimetro del rectangulo: " + perimetro);
        System.out.println("Area del rectangulo: " + area);
                
                
        
        
    }
    
}
