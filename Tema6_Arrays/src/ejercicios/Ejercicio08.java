package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
    /**
     * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con
     * “Javalín, javalón”, para después hacer una pausa más o menos larga (la pausa se representa mediante espacios
     * en blanco o tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no comienza sus frases
     * con la muletilla anterior, pero siempre las terminan con un silencio, más o menos prolongado y la coletilla
     * “javalén, len, len”. Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida está
     * escrita en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre solo el
     * mensaje sin muletillas.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        String frase;

        //Declaramos el scanner
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca una frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();

        if (esJavalandia(frase)) {  //Si la frase está escrita en el idioma de Javalandia mostramos la traducción
            System.out.println("La frase esta escrita en el idioma de Javalandia");
            System.out.println("La frase traducida es: " + traduccion(frase));
        } else {                    //Si no, lo indicamos por consola
            System.out.println("La frase no esta en el idioma de Javalandia");
        }

        //Cerramos el scanner
        sc.close();
    }

    /**
     * Metodo que comprueba si
     * @param frase está o no escrita en el idioma de Javalandia.
     * @return false si no está en el idioma de Javalandia y true si está en el idioma de Javalandia
     */
    static boolean esJavalandia(String frase) {
        //Declaramos las variables
        boolean esIdioma = false;

        //Si la frase empieza o termina por las coletillas especificadas en el enunciado
        if (frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len")) {
            esIdioma = true;  //Indicamos que la frase está en el idioma de Javalandia
        }

        return esIdioma;
    }

    /**
     * Método que traduce la
     * @param frase si está en el idioma de Javalandia
     * @return la frase traducida
     */
    static String traduccion(String frase) {

        //Declaramso las variables
        String fraseTraducida = "";
        int posColetillaFinal = frase.indexOf("javalén, len, len");

        if (frase.startsWith("Javalín, javalón")) {          //Si la frase empieza por "Javalín, javalón"
            //Hacemos una subcadena que le quite la coletilla
            fraseTraducida = frase.substring(17);
            //Le quitamos los espacios en blanco innecesarios
            fraseTraducida = fraseTraducida.trim();

        } else if (frase.endsWith("javalén, len, len")) {   //Si la frase termina por "javalén, len, len"
            //Hacemos una subcadena que le quite la coletilla
            fraseTraducida = frase.substring(0, posColetillaFinal);
            //Le quitamos los espacios en blanco innecesarios
            fraseTraducida = fraseTraducida.trim();
        }

        return fraseTraducida;
    }

}
