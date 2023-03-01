package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	
	final static String PROHIBIDA = "fin"; //Variable global que indica el final del programa

	public static void main(String[] args) {
		String cad = ""; //Cadena donde se guardará la oración entera
		String palabra; //Guarda cada palabra introducida
		
		Scanner sc = new Scanner(System.in);
		
		do { //Mientras no se introduzca "fin"
			System.out.println("Introduzca una palabra: "); 
			palabra = sc.next();
			cad += palabra + " "; //Añadimos la palabra a la cadena
		}while(!palabra.equalsIgnoreCase(PROHIBIDA)); 
		
		//Pasamos la cadena 'cad' a un array de chars y eliminamos la palabra 'fin'
		cad = String.copyValueOf(cad.toCharArray(), 0, (cad.length()-1 - PROHIBIDA.length()));
		
		System.out.println(cad);
		
		sc.close();
	}

}
