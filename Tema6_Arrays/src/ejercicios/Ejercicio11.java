package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		String cad;
		String [] palabras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una oración: ");
		cad = sc.nextLine();
		
		palabras = cad.split(" ");
		
		masGrande(palabras);
		
		sc.close();
	}
	
	public static void masGrande(String[] palabras) {
		String larga = "";
		
		for(int i=0; i<palabras.length; i++) {
			if(palabras[i].length() > larga.length()) {
				larga = palabras[i];
			}
		}
		
		System.out.println("La palabra más larga de esa cadena es \"" + larga + "\" y su longitud es de " + larga.length() + " letras.");
	}

}
