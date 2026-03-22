package Textos;

import java.util.Scanner;

/**
 * Análisis de un texto
 *
 * @author Juan Francisco Rodríguez Berenguel
 */
public class analisisTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //--------------------------------------------
        //          Declaración de variables 
        //--------------------------------------------
        //Constantes
        //Variables de entrada
        String texto;

        //Variables Salida
        boolean mas5Caracteres, comienzaMayuscula, terminaMinuscula, terminaPuntosSuspensivos;

        //Variables auxiliares
        int longitudTexto;
        char primerCaracter, ultimoCaracter, penultimoCaracter, antepenultimoCaracter;

        //Clase scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //--------------------------------------------
        //                Entrada de datos 
        //--------------------------------------------
        System.out.println("ANÁLISIS DE UN TEXTO");
        System.out.println("--------------------");
        System.out.println("Introduce un texto: ");
        texto = teclado.nextLine();

        //--------------------------------------------
        //                Procesamiento
        //--------------------------------------------
        //Cálculo de información auxiliar previa
        longitudTexto = texto.length();
        primerCaracter = texto.charAt(0);
        ultimoCaracter = texto.charAt(longitudTexto - 1);
        penultimoCaracter = texto.charAt(longitudTexto - 2);
        antepenultimoCaracter = texto.charAt(longitudTexto - 3);

        //Comprobamos si tiene más de 5 caracteres
        mas5Caracteres = longitudTexto > 5;

        //Comprobamos si empieza con una letra mayúscula
        comienzaMayuscula = primerCaracter >= 'A' && primerCaracter <= 'Z';

        //comprobamos si termina por una letra minúscula
        terminaMinuscula = ultimoCaracter >= 'a' && ultimoCaracter <= 'z';

        //Comprobamos si termina en puntos suspensivos ...
        terminaPuntosSuspensivos = ultimoCaracter == '.' && penultimoCaracter == '.' && antepenultimoCaracter == '.';

        //Salida de resultados
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("----------");
        System.out.println("El texto contiene más de cinco caracteres: " + mas5Caracteres);
        System.out.println("El texto comienza con una letra mayúscula: " + comienzaMayuscula);
        System.out.println("El texto termina con una letra minúscula: " + terminaMinuscula);
        System.out.println("El texto termina con unos puntos suspensivos (...): " + terminaPuntosSuspensivos);

        teclado.close();

    }

}
