package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	
	final static String PROHIBIDA = "fin"; //Variable global que indica el final del programa

	public static void main(String[] args) {
		String cad = ""; //Cadena donde se guardará la oración entera
		String palabra = ""; //Guarda cada palabra introducida
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una palabra: "); 
		palabra = sc.next();
		
		while(!palabra.equalsIgnoreCase(PROHIBIDA)) {
			cad += palabra + " "; //Añadimos la palabra a la cadena
			System.out.println("Introduzca una palabra: "); 
			palabra = sc.next();
		}
		
		System.out.println(cad);
		
		sc.close();
	}

}
