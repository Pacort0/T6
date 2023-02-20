package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		String contrasenia;
		String adivina;

		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1: Cree la contraseña: ");
		contrasenia = sc.next();
		do {
			System.out.println("Jugador 2: Intente acertar la contraseña:");
			adivina = sc.next();
			if(adivina.compareTo(contrasenia)<0) {
				System.out.println("La contraseña es mayor alfabéticamente. Inténtelo de nuevo.");
			}
			else if(adivina.compareTo(contrasenia)>0) {
				System.out.println("La contraseña es menor alfabéticamente. Inténtelo de nuevo.");
			}
		} while (!adivina.equals(contrasenia));
		
		System.out.println("¡Contraseña acertada!");
		
		sc.close();
	}

}
