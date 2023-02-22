package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		String cad;
		String anagrama;
		String adivina;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("JUGADOR 1: Introduzca una palabra: ");
		cad = sc.next();
		
		anagrama = desordena(cad);
			
		System.out.println("JUGADOR 2: Es su turno de adivinar la palabra del JUGADOR 1.");
		do {
			System.out.println("El anagrama de la palabra es \"" + anagrama + "\". Adelante: ");
			adivina = sc.next();
			
			cont++;
			System.out.println("Usted lleva " + cont + " intentos.");
			
		}while(!cad.equalsIgnoreCase(adivina));
		
		System.out.println("Enhorabuena, ¡has acertado!");
		
		sc.close();
	}
	
	public static String desordena(String cad) {
		char[] cadena = cad.toCharArray();
		char[] cadDesOrd = new char[cadena.length];
		int[] usados = new int[0];
		int indice = 0;
		
		for(int i=0; i<cadena.length; i++) {
			
			do {
				indice = (int)(Math.random()*cadena.length);
				cadDesOrd[i] = cadena[indice];
			}while(repetido(usados, indice));
			
			usados = Arrays.copyOf(usados, usados.length+1);
			usados[usados.length-1] = indice;
		}
		
		return String.valueOf(cadDesOrd);
	}
	
	public static Boolean repetido(int[] usados, int indice) {
		Boolean repetido = false;
		int cont = 0;
		
		while(cont<usados.length && repetido == false) {
			repetido = usados[cont] == indice ? true : false;
			cont++;
		}
		
		return repetido;
	}

}
