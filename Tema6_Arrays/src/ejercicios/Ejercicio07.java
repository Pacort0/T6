package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		String cad; //Guarda la ración que introduce el usuario

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una cadena: "); 
		cad = sc.nextLine();

		cad = cad.replaceAll(" ", ""); //'Eliminamos' los espacios de la oración

		System.out.println(delReves(cad).equalsIgnoreCase(cad) ? "La cadena introducida es un palíndromo."
				: "La cadena introducida no es un palíndromo.");

		sc.close();
	}

	/**
	 * Función que devuelve la cadena original dada la vuelta
	 * @param cadOriginal Recibe por parámetros la cadena introducida por el usuario
	 * @return Devuelve una cadena dada la vuelta
	 */
	public static String delReves(String cadOriginal) { 
		String dateLaVuelta = "";

		for (int i = cadOriginal.length() - 1; i >= 0; i--) {
			dateLaVuelta += cadOriginal.charAt(i);
		}

		return dateLaVuelta;
	}

}
