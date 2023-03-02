package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		String cad; // Guarda la cadena introducida por teclado
		String[] palabras; // Guardará las palabras de la cadena por separado

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una oración: ");
		cad = sc.nextLine();

		palabras = cad.split(" "); // Dividimos la cadena en palabras independientes y las guardamos en un array

		masGrande(palabras); // Llamada a la función 'palabras'

		sc.close();
	}

	/**
	 * Función que obtiene e imprime la palabra más larga de la cadena introducida
	 * 
	 * @param palabras Recibe el array con todas las palabras de la cadena
	 */
	public static void masGrande(String[] palabras) {
		String larga = ""; // Guarda la palabra más larga

		for (int i = 0; i < palabras.length; i++) { // Recorremos el array de palabras
			if (palabras[i].length() > larga.length()) { // Si la palabra en la posición 'i' es más grande que la
															// palabra más grande hasta ese momento
				larga = palabras[i];
			}
		}

		System.out.println("La palabra más larga de esa cadena es \"" + larga + "\" y su longitud es de "
				+ larga.length() + " letras.");
	}

}
