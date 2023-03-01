package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		String cad; //Guarda la cadena introducida por teclado

		Scanner sc = new Scanner(System.in); 

		System.out.println("Introduzca una oración en algún idioma: ");
		cad = sc.nextLine();
		
		javalan(cad); //Llama a la función 'javalan'
		
		sc.close();
	}
	
	/**
	 * Función que devuelve la traducción de la cadena 
	 * @param cad Recibe la cadena original por parámetros
	 */
	public static void javalan(String cad) { 
		String idiomaRaro; //Cadena que guarda la solución

		idiomaRaro = (cad.startsWith("Javalin, javalon, \t") || cad.endsWith("\t" + "javalen, len, len"))
				? traduccion(cad) //Si la cadena está escrita en javalan, se llama a la función 'traduccion'
				: cristiano(); //Si la cadena está escrita en español, se llama a la función 'cristiano'

		System.out.println(idiomaRaro); //Devuelve la cadena impresa
	}
	
	/**
	 * Función que devuelve la cadena original traducida
	 * @param cad Recibe la cadena original por parámetros
	 * @return Devuelve la cadena traducida
	 */
	public static String traduccion(String cad) {
		String traducido;
		int indice;

		if (cad.startsWith("Javalin, javalon," + "\t")) {
			indice = cad.indexOf("\t");
			traducido = cad.substring(indice);
		} else {
			indice = cad.indexOf("\t");
			traducido = cad.substring(0, indice);
		}

		return "La cadena introducida está escrita en Javaliano: " + traducido;
	}
	
	/**
	 * Función que indica que la cadena original está escrita en español
	 * @return Devuelve una cadena
	 */
	public static String cristiano() {
		return "La cadena introducida está escrita en español.";
	}

}
