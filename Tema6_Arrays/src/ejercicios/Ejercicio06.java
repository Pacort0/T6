package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		String palabra; // Guarda la palabra que introduzcamos por teclado
		String cad; // Guarda la frase que introduzcamos por teclado
		int inicio = 0; // Indice de la ultima referencia a la palabra que se busca
		int cont = 0; // Cuenta las ocurrencias de la palabra

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		cad = sc.nextLine();
		System.out.println("Introduzca una palabra: ");
		palabra = sc.next();

		while (inicio >= 0 && inicio < cad.length()) { // Mientras la palabra exista entre 'indice' y 'cad.length'
			inicio = (cad.indexOf(palabra, inicio)); // 'inicio' toma el valor del indice de la primera ocurrencia de
														// 'palabra' entre inicio y cadena.length
			
			if (inicio >= 0) { //Si la palabra existe en lo que resta de cadena 
				inicio += palabra.length(); //Se aumenta el valor del indice inicial
				cont++; //Se aumenta en 1 el valor del contador
			}
		}

		System.out.println("La palabra aparece en la cadena un total de " + cont + " veces.");
		sc.close();
	}

}
