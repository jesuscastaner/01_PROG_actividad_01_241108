package ejercicios;

/* ENUNCIADO:
 * Diseñar un programa que muestre el producto y la suma de los 10 primeros números impares.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int suma = 0;
        int producto = 1;
        int contador = 0;
        
        for (int i = 1; contador < 10; i += 2) {
        	
            suma += i;
            producto *= i;
            contador++;
        }
        
        System.out.println("Suma de los 10 primeros números impares: " + suma);
        System.out.println("Producto de los 10 primeros números impares: " + producto);
	}
}
