package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		String contrasenia;
		String adivina;
		char[] pistas = new char[0];

		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1: Cree la contraseña: ");
		contrasenia = sc.next();
		
		pistas = rellenaArray(pistas, contrasenia);
		
		do {
			System.out.println("Jugador 2: Intente acertar la contraseña:");
			adivina = sc.next();
			
			pista(contrasenia, adivina, pistas);
			
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
	
	public static char[] rellenaArray(char[] pistas, String clave){
		pistas = Arrays.copyOf(pistas, clave.length());
		Arrays.fill(pistas, '*');
		
		return pistas;
	}
	
	public static void pista(String solucion, String intento, char[] pista) {
		int cont = 0;
		
		while(cont<intento.length() && cont<solucion.length()) {
			pista[cont] = solucion.charAt(cont) == intento.charAt(cont) ? pista[cont] = solucion.charAt(cont) : '*'; 
			cont++;
		}
		
		System.out.println(String.valueOf(pista));
	}

}
