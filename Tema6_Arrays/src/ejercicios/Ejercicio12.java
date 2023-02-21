package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la primera palabra: ");
		palabra1 = sc.next();
		System.out.println("Introduzca la segunda palabra: ");
		palabra2 = sc.next();
		
		System.out.println(palabra1.length() == palabra2.length() ? anagrama(palabra1, palabra2) : "Las palabras no son de igual tamaño.");
		
		sc.close();
	}
	
	public static String anagrama(String palabra1, String palabra2) {
		char[] p1 = palabra1.toCharArray();
		char[] p2 = palabra2.toCharArray();
		String resultado;
		Boolean anagramico = false;
		
		for(int i=0; i<palabra1.length(); i++) {
			for(int j=0; j<palabra2.length(); j++) {
				anagramico = p1[i] == p2[j] ? true : false;
				if (anagramico) {
					p1[i] = ' ';
					p2[j] = ' ';
					break;
				}
			}
			if(!anagramico) {
				break;
			}
		}
		
		resultado = anagramico ? "Las palabras son anagramas" : "Las palabras no son anagramas." ;
		
		return resultado;
	}

}
