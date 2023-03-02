package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		String cad; // Guarda la cadena que se introduce por teclado

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una oración: ");
		cad = sc.nextLine().toLowerCase(); // Guardamos la cadena sin mayúsculas

		cad = cad.replaceAll(" ", ""); // Eliminamos todos los espacios para que no se cuenten

		cuentaLetras(cad); // Llamada a la función 'cuentaLetras'

		sc.close();
	}

	/**
	 * Función que cuenta e imprime todas las letras que aparecen en la cadena
	 * introducida por teclado
	 * 
	 * @param cad Recibe la cadena por teclado
	 */
	public static void cuentaLetras(String cad) {
		char[] letras = cad.toCharArray(); // Pasamos la cadena original a un array de chars

		System.out.println("Resultado: ");

		for (int i = 0; i < cad.length(); i++) { // Recorremos el array de chars
			if (!repetida(letras, i)) { // Si la letra no ha aparecido antes en la cadena
				System.out.println(letras[i] + ": " + contador(letras, i) + " veces."); // Contamos sus apariciones
			}
		}
	}

	/**
	 * Función que determina si una letra ya se ha usado antes o no
	 * 
	 * @param letras Cadena original transformada en un array de chars
	 * @param indice Posición en la que se encuentra el bucle que llama a la función
	 * @return Devuelve un booleano
	 */
	public static Boolean repetida(char letras[], int indice) {
		Boolean repetida = false; // Compruebo si ya he usado esa letra
		int cont = 0;

		while (!repetida && cont < indice && indice != 0) { // Mientras no se encuentren repeticiones de la letra, el
															// contador sea menor al índice y el índice no sea 0
			repetida = letras[cont] == letras[indice] ? true : false; //Damos valor al booleano
			cont++; //Aumentamos el contador
		}

		return repetida;
	}
	
	/**
	 * Función 	que cuenta las incidencias de una letra en la cadena
	 * @param letras Cadena original transformada en un array de chars
	 * @param indice Posición en la que se encuentra el bucle que llama a la función
	 * @return Devuelve la cantidad de apariciones de una letra
	 */
	public static int contador(char letras[], int indice) {
		int cont = 0; // Cuento las incidencias de esa letra

		for (int i = indice; i < letras.length; i++) { //Recorremos el array de chars a partir de 'indice'
			if (letras[i] == letras[indice]) { //Si se encuentran coincidencias, se aumenta el contador
				cont++;
			}
		}
		return cont;
	}

}
