package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		String cad;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca una oración: ");
		cad = sc.nextLine().toLowerCase();
		
		cad = cad.replaceAll(" ", "");
		
		cuentaLetras(cad);
		
		sc.close();
	}
	
	public static void cuentaLetras(String cad) {
		char[] letras = cad.toCharArray();
		
		System.out.println("Resultado: ");
		
		for(int i=0; i<cad.length(); i++) {
			if(!repetida(letras, i)) {
				System.out.println(letras[i] + ": " + contador(letras, i) + " veces.");
			}
		}
	}
	
	public static Boolean repetida(char letras[], int indice) {
		Boolean repetida = false;
		int cont=0;
		
		while(repetida != true && cont<indice && indice != 0) {
			repetida = letras[cont] == letras[indice] ? true : false;
			cont++;
		}
		
		return repetida;
	}
	
	public static int contador (char letras[], int indice) {
		int cont = 0;
		
		for(int i=indice; i<letras.length; i++) {
			if(letras[i] == letras[indice]) {
				cont++;
			}
		}
		return cont;
	}

}
