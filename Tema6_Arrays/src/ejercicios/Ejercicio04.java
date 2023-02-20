package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		String cad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena: ");
		cad = sc.nextLine();
		
		delReves(cad);
		
		sc.close();
	}
	
	public static void delReves(String cadOriginal) {
		String dateLaVuelta = "";
		
		for(int i=cadOriginal.length()-1; i>=0; i--) {
			dateLaVuelta += cadOriginal.charAt(i);
		}
		
		System.out.println(dateLaVuelta);
	}

}
