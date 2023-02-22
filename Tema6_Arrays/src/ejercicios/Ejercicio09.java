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
		
		for(int i=0; i<aCodificar.length(); i++) { //Recorremos la palabra
			c = aCodificar.charAt(i); //Cogemos el caracter 'i' de la palabra
			codificacion = Arrays.copyOf(codificacion, codificacion.length+1); //Aumentamos el tamaño del array de caracteres
			codificacion[i] = codifica(conjunto1, conjunto2, c); //Asignamos a la nueva posicion del array el valor codificado del caracter c
		}
		codificado = String.valueOf(codificacion); //Pasamos la palabra codificada de 'array de chars' a 'String'
		
		System.out.println(codificado);
		
		sc.close();
	}
	
	public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
		String conj1 = String.valueOf(conjunto1); //Pasamos el array de chars a una cadena para poder buscar la posición de 'c'
		int indiC; //Para guardar el valor de la posición de 'c'
		
		indiC = conj1.indexOf(c); //Buscamos el valor de la posición de 'c' y lo guardamos en 'indiC'
		
		if(indiC >= 0) { //Si la letra es codificable (si el valor es positivo, ya que si no la encuentra, 'indexOf' devuelve '-1')
			c = conjunto2[indiC]; //Cambiamos el valor de 'c' al valor guardado en la posición 'indiC' del conjunto2
		}
		
		return c;
	}

}
