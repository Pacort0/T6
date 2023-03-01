package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		String cad; //Guarda la cadena introducida
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena: ");
		cad = sc.nextLine();
		
		delReves(cad); //Llamada a la función 'delReves'
		
		sc.close();
	}
	
	/**
	 * Función que imprime la cadena original del revés
  	 * @param cadOriginal Cadena que introduce el usuario
	 */
	public static void delReves(String cadOriginal) { 
		String dateLaVuelta = ""; //Cadena para guardar la cadena dada la vuelta
		
		//Recorremos la oracion del final a principio
		for(int i=cadOriginal.length()-1; i>=0; i--) { 
			dateLaVuelta += cadOriginal.charAt(i); //Creamos la cadena caracter a caracter a partir de la anterior
		}
		
		System.out.println(dateLaVuelta); //Imprime la cadena dada la vuelta
	}

}
