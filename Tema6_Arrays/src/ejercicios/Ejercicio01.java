package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		String cad1;
		String cad2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la primera cadena: ");
		cad1 = sc.nextLine();
		System.out.println("Introduzca la segunda cadena: ");
		cad2 = sc.nextLine();

		if (cad1.length() > cad2.length()) {
			System.out.println("La segunda cadena es más corta.");
		} else if (cad2.length() > cad1.length()) {
			System.out.println("La primera cadena es la más corta.");
		} else {
			System.out.println("Ambas cadenas tienen los mismos caracteres.");
		}
		sc.close();
	}

}
