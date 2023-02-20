package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		String cad;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		cad = sc.nextLine();
		
		for(int i=0; i<cad.length()-1; i++) {
			if(cad.charAt(i) == ' ') {
				cont++;
			}
		}
		
		System.out.println("En la frase hay un total de " + cont + " espacios.");
		sc.close();
	}

}
