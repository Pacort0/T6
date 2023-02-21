package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		String cad;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una cadena: ");
		cad = sc.nextLine();

		cad = cad.replaceAll(" ", "");

		System.out.println(delReves(cad).equalsIgnoreCase(cad) ? "La cadena introducida es un palíndromo."
				: "La cadena introducida no es un palíndromo.");

		sc.close();
	}

	public static String delReves(String cadOriginal) {
		String dateLaVuelta = "";

		for (int i = cadOriginal.length() - 1; i >= 0; i--) {
			dateLaVuelta += cadOriginal.charAt(i);
		}

		return dateLaVuelta;
	}

}
