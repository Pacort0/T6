package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		String contrasenia; //Para guardar la contraseña
		String adivina; //Para guardar los intentos de adivinar la constraseña
		char[] pistas = new char[0]; //Array de chars con el que iremos mostrando pistas

		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1: Cree la contraseña: ");
		contrasenia = sc.next();
		
		pistas = rellenaArray(pistas, contrasenia); //Damos tamaño y rellenamos el array con *
		
		do { //El bucle se ejecutará una vez y se repetirá hasta que se acierte la constraseña
			System.out.println("Jugador 2: Intente acertar la contraseña:");
			adivina = sc.next();
			
			pista(contrasenia, adivina, pistas); //Mostramos un string con las pistas
			
			if(adivina.compareTo(contrasenia)<0) { //Si la cadena introducida es menor alfabéticamente
				System.out.println("La contraseña es mayor alfabéticamente. Inténtelo de nuevo.");
			}
			else if(adivina.compareTo(contrasenia)>0) { //Si la cadena introducida es mayor alfabéticamente
				System.out.println("La contraseña es menor alfabéticamente. Inténtelo de nuevo.");
			}
		} while (!adivina.equals(contrasenia));
		
		System.out.println("¡Contraseña acertada!"); //Mensaje final
		
		sc.close();
	}
	/**
	 * Función que da tamaño al array y lo rellena de '*'
	 * @param pistas Array de chars de tamaño [0]
	 * @param clave String con la contraseña introducida
	 * @return Devuelve el array de chars rellenado
	 */
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
