package ejercicios;

import java.util.Scanner;

/* ENUNCIADO:
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
 * Si la nota introducida no está en el rango, mostrar el mensaje “Nota errónea”.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce una nota entre 0 y 10: ");
        double nota = scanner.nextDouble();
        
        if (nota >= 0 && nota <= 10) {
        	
            if (nota < 5) {
                System.out.println("Insuficiente");
                
            } else if (nota < 6) {
                System.out.println("Suficiente");
                
            } else if (nota < 7) {
                System.out.println("Bien");
                
            } else if (nota < 9) {
                System.out.println("Notable");
                
            } else {
                System.out.println("Sobresaliente");
            }
            
        } else {
            System.out.println("Nota errónea.");
        }
        
        scanner.close();
	}
}
