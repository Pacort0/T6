package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		String palabra;
		String cad;
		int inicio = 0;
		int cont = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca una frase: ");
		cad = sc.nextLine();
		System.out.println("Introduzca una palabra: ");
		palabra = sc.next();
		
		while(inicio >= 0 && inicio < cad.length()) {
			inicio = (cad.indexOf(palabra, inicio));
			if(inicio >= 0) {
				inicio += palabra.length();
				cont++;
			}
		}
		
		System.out.println("La palabra aparece en la cadena un total de " + cont + " veces.");
		sc.close();
	}

}
