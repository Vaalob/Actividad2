
package Calificaciones;

import java.util.Scanner;

public class Calif {

    public static void main(String[] args) {
        
        
        Promedio objPromedio = new Promedio();
        objPromedio.crearNombre("Jose");
        
        Scanner capturar = new Scanner(System.in);
        Promedio calif = new Promedio();
        
        System.out.println("Insertar calificaciones: ");
        float nota1 = capturar.nextFloat();
        float nota2 = capturar.nextFloat();
        float nota3 = capturar.nextFloat();
        float nota4 = capturar.nextFloat();
        float nota5 = capturar.nextFloat();
        
        calif.calcularProm(nota1, nota2, nota3, nota4, nota5);
   
        System.out.println("\nResultados Finales\n");
        System.out.println("Nombre: " + objPromedio.getNombre());
        System.out.println("Calificacion 1: " +nota1);
        System.out.println("Calificacion 2: " +nota2);
        System.out.println("Calificacion 3: " +nota3);
        System.out.println("Calificacion 4: " +nota4);
        System.out.println("Calificacion 5: " +nota5);
        calif.mostrarNota();
        calif.mostraProm();
        
    }
    
}
