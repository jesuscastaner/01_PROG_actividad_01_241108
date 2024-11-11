package ejercicios;

import java.util.Scanner;

/* ENUNCIADO:
 * Leer números hasta que se introduzca un cero.
 * Para cada uno indicar si es par o impar.
 * Al final mostrar las siguientes estadísticas:
 * > Cuántos son pares e impares.
 * > Cuánto suman los pares y cuánto los impares.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int numeroPares = 0;
        int numeroImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        
        System.out.print("Introduce un número (0 para terminar y mostrar estadísticas): ");
        
        while (true) {
        	
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
                numeroPares++;
                sumaPares += numero;
                
            } else {
                System.out.println("El número " + numero + " es impar.");
                numeroImpares++;
                sumaImpares += numero;
            }
            
            System.out.print("Introduce otro número: ");
        }
        
        System.out.println("Cantidad de números pares: " + numeroPares);
        System.out.println("Cantidad de números impares: " + numeroImpares);
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los números impares: " + sumaImpares);
        
        scanner.close();
	}
}
