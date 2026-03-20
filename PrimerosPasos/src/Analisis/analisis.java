package Analisis;

import java.util.Scanner;

/**
 * Análisis de un número
 *
 * @author Juan Francisco Rodríguez Berenguel
 */
public class analisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //--------------------------------------------
        //          Declaración de variables 
        //--------------------------------------------
        //Constantes
        //Variables de entrada
        int numero;

        //variables de salida
        boolean esDistintoCero, esNegativo,estaEntre0y10, esMultiplo2PositivoMenor20;

        //Variables auxiliares
        //Clase Scanner para los datos de entrada
        Scanner teclado = new Scanner(System.in);

        //--------------------------------------------
        //                Entrada de datos 
        //--------------------------------------------
        
        System.out.println("ANÁLISIS DE UN NÚMERO");
        System.out.println("---------------------");
        System.out.println("Introduzca un número entero: ");
        numero = teclado.nextInt();
        
        //--------------------------------------------
        //                Procesamiento
        //--------------------------------------------
        
        esDistintoCero = numero!=0;
        esNegativo =numero<0;
        estaEntre0y10 = numero>=0 && numero<=10;
        esMultiplo2PositivoMenor20 = numero%3==0 && numero>0 && numero<20;
        
        //--------------------------------------------
        //                Salida de resultados
        //--------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("----------");
        System.out.println("El número es distinto de cero: "+esDistintoCero);
        System.out.println("El número es negativo: "+esNegativo);
        System.out.println("El número está entre 0 y 10 (ambos incluidos): "+estaEntre0y10);
        System.out.println("El número es múltiplo de 3, positivo y menor que 20: "+esMultiplo2PositivoMenor20);
        
        teclado.close();
        
        
        
        
        
        
    }

}
