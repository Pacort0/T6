package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		String cad;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una oración en algún idioma: ");
		cad = sc.nextLine();
		
		javalan(cad);
		
		sc.close();
	}

	public static void javalan(String cad) {
		String idiomaRaro;

		idiomaRaro = (cad.startsWith("Javalin, javalon, \t") || cad.endsWith("\t" + "javalen, len, len"))
				? traduccion(cad)
				: cristiano();

		System.out.println(idiomaRaro);
	}

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

	public static String cristiano() {
		return "La cadena introducida está escrita en español.";
	}

}
