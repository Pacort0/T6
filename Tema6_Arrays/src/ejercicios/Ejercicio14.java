package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		String cad; //Guarda la cadena que introduzcamos por teclado 
		String anagrama; //Guarda el anagrama generado por el programa
		String adivina; //Guarda el intento de adivinar el anagrama del usuario
		int cont = 0; //Contador de intentos
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("JUGADOR 1: Introduzca una palabra: ");
		cad = sc.next();
		
		anagrama = desordena(cad); //Desordenamos la palabra original
			
		System.out.println("JUGADOR 2: Es su turno de adivinar la palabra del JUGADOR 1.");
		do { //Se imprime al menos una vez
			System.out.println("El anagrama de la palabra es \"" + anagrama + "\". Adelante: "); 
			adivina = sc.next();
			
			cont++;
			System.out.println("Usted lleva " + cont + " intentos.");
			
		}while(!cad.equalsIgnoreCase(adivina)); //Mientras el usuario no adivine la palabra original
		
		System.out.println("Enhorabuena, ¡has acertado!");
		
		sc.close();
	}
	
	/**
	 * Función que desordena la palabra introducida por el usuario
	 * @param cad Palabra introducida por el usuario
	 * @return Devuelve la palabra desordenada
	 */
	public static String desordena(String cad) {
		char[] cadena = cad.toCharArray(); //Pasamos la palabra a un array de chars
		char[] cadDesOrd = new char[cadena.length]; //Guardaremos la palabra desordenada
		int[] usados = new int[0]; //guardaremos la posicion de las letras que ya se hayan usado
		int indice = 0; //Para guardar una posición aleatoria de la palabra
		
		for(int i=0; i<cadena.length; i++) { //Recorremos la palabra
			
			do { //Al menos una vez
				indice = (int)(Math.random()*cadena.length); //Elegimos un índice aleatorio
				cadDesOrd[i] = cadena[indice]; //Ponemos la letra de la posición aleatoria en la posición 'i' de la cadena desordenada
			}while(repetido(usados, indice)); //Esto se repetirá mientras la letra no se haya usado ya
			
			usados = Arrays.copyOf(usados, usados.length+1); //Aumentamos el tamaño de 'usados' en 1
			usados[usados.length-1] = indice; //Introducimos la posicion de la letra usada en el hueco recién creado
		}
		
		return String.valueOf(cadDesOrd); //Pasamos el array de chars a una cadena
	}
	
	/**
	 * Función que determina si una letra se ha repetido ya o no
	 * @param usados Array de chars con las letras usadas
	 * @param indice Posición de la letra actual
	 * @return Devuelve un booleano en función de si la letra ya ha sido usada o no
	 */
	public static Boolean repetido(int[] usados, int indice) {
		Boolean repetido = false; //Determinará el resultado del análisis
		int cont = 0; 
		
		while(cont<usados.length && !repetido) { //Mientras el contador no sobrepase el tamaño del array de índices y no se repita la letra
			repetido = usados[cont] == indice ? true : false; //Damos valor al booleano
			cont++;
		}
		
		return repetido;
	}

}
