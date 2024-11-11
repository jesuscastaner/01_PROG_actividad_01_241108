package ejercicios;

/* ENUNCIADO:
 * Escribir todos los números del 100 al 0 de 7 en 7.
 * Al final mostrar las siguientes estadísticas:
 * > Cuántos números has escrito.
 * > Cuánto suman los números escritos.
 * > Cuántos de estos números son pares.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int contadorNumeros = 0;
        int suma = 0;
        int contadorPares = 0;
        
        for (int i = 100; i >= 0; i -= 7) {
        	
            System.out.println(i);
            contadorNumeros++;
            
            suma += i;
            
            if (i % 2 == 0) {
            	contadorPares++;
            }
        }

        System.out.println("Cantidad de números escritos: " + contadorNumeros);
        System.out.println("Suma de los números escritos: " + suma);
        System.out.println("Cantidad de números pares: " + contadorPares);
	}
}
