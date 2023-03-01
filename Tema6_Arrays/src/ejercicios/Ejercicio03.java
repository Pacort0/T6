package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		String cad; //Guarda la cadena que se introduce
		int cont = 0; //Contador de espacios
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		cad = sc.nextLine();
		
		//Bucle para recorrer la oración
		for(int i=0; i<cad.length()-1; i++) { 
			if(cad.charAt(i) == ' ') { //Si algún carácter es un espacio, se suma +1 a cont
				cont++;
			}
		}
		
		System.out.println("En la frase hay un total de " + cont + " espacios.");
		sc.close();
	}

}
