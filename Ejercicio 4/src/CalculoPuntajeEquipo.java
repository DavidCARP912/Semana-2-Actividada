import java.util.Scanner;

public class CalculoPuntajeEquipo {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        int ganados, perdidos, empatados, puntosTotales;
        
        System.out.println("Ingrese partidos ganados");
        ganados = datos.nextInt();
        
        System.out.println("Ingrese partidos perdidos");
        perdidos = datos.nextInt();
        
        System.out.println("Ingrese partidos empatados");
        empatados = datos.nextInt();
        
        puntosTotales = (ganados * 3) + (empatados * 1) + (perdidos * 0);
        
        System.out.println("Puntaje total: " + puntosTotales);
    }
}