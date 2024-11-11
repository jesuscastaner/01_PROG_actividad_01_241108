package ejercicios;

import java.util.Scanner;

/* ENUNCIADO:
 * Pedimos por pantalla un nombre y una contraseña:
 * Si el nombre coincide con “sara”, preguntamos por la contraseña,
 * y si coincide con “sarita”, escribimos el mensaje “usuario y contraseña correctas, bienvenido a la aplicación”.
 * Si el nombre NO es “sara” Escribimos “usuario incorrecto”.
 * Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el nombre de usuario: ");
        String nombre = scanner.nextLine();
        
        if (nombre.equals("sara")) {
        	
            System.out.print("Introduce la contraseña: ");
            String contraseña = scanner.nextLine();
            
            if (contraseña.equals("sarita")) {
                System.out.println("Usuario y contraseña correctas, bienvenido a la aplicación.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
            
        } else {
            System.out.println("Usuario incorrecto.");
        }
        
        scanner.close();
	}
}
