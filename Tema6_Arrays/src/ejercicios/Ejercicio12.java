package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		String palabra1; //Guarda la primera palabra introducida por teclado
		String palabra2; //Guarda la segunda palabra introducida por teclado

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la primera palabra: ");
		palabra1 = sc.next();
		System.out.println("Introduzca la segunda palabra: ");
		palabra2 = sc.next();

		System.out.println(palabra1.length() == palabra2.length() ? anagrama(palabra1, palabra2)
				: "Las palabras no son de igual tamaño."); //Según las palabras sean anagramas o no, imprime una cosa u otra

		sc.close();
	}
	
	/**
	 * Función que determina si una palabras son o no anagrama de la otra
	 * @param palabra1 Primera palabra
	 * @param palabra2 Segunda palabra
	 * @return Devuelve una cadena en función del resultado del análisis de ambas palabras
	 */
	public static String anagrama(String palabra1, String palabra2) {
		char[] p1 = palabra1.toCharArray(); //Pasamos ambas palabras a arrays de chars
		char[] p2 = palabra2.toCharArray();
		String resultado; //Guardará el resultado
		Boolean anagramico = false; //Variable booleana para romper los bucles for

		for (int i = 0; i < palabra1.length(); i++) {
			for (int j = 0; j < palabra2.length(); j++) { //Recorremos ambas palabras comparándolas caracter a caracter
				if (p1[i] == p2[j]) { 
					anagramico = true; //Mientras las letras tengan algún "match"
					p1[i] = ' '; //Las letras con match las convertimos en espacios, para que no vuelvan a hacer "match"
					p2[j] = ' ';
					break; //Salimos del segundo bucle una vez encontramos un "match"
				}
			}
			if (!anagramico) { //Si una de las letras de palabra1 no tiene "match" con ninguna letra de palabra2, salimos del primer bucle
				break;
			}
		}

		//Damos un valor a la variable resultado
		resultado = anagramico ? "Las palabras son anagramas" : "Las palabras no son anagramas.";

		return resultado;
	}

}
