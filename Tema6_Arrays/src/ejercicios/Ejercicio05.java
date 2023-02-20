package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	
	final static String PROHIBIDA = "fin";

	public static void main(String[] args) {
		String cad = "";
		String palabra;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca una palabra: ");
			palabra = sc.next();
			cad += palabra + " ";
		}while(!palabra.equalsIgnoreCase(PROHIBIDA));
		
		cad = String.copyValueOf(cad.toCharArray(), 0, (cad.length()-1 - PROHIBIDA.length()));
		
		System.out.println(cad);
		
		sc.close();
	}

}
