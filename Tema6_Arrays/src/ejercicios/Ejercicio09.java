package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		String aCodificar;
		char c;
		char[] codificacion = new char[0];
		String codificado = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esta es la tabla de caracteres: " + String.valueOf(conjunto1) + "\nEscriba una palabra a codificar: ");
		aCodificar = sc.next().toLowerCase();
		
		for(int i=0; i<aCodificar.length(); i++) {
			c = aCodificar.charAt(i);
			codificacion = Arrays.copyOf(codificacion, codificacion.length+1);
			codificacion[i] = codifica(conjunto1, conjunto2, c);
		}
		codificado = String.valueOf(codificacion);
		
		System.out.println(codificado);
		
		sc.close();
	}
	
	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
		String conj1 = String.valueOf(conjunto1);
		int indiC;
		
		indiC = conj1.indexOf(c);
		
		if(indiC >= 0) {
			c = conjunto2[indiC];
		}
		
		return c;
	}

}
