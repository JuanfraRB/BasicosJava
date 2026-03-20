package CalculosAritmeticos;

import java.util.Scanner;

/**
 *
 * <strong>Cálculos Aritméticos</strong>
 * Programa que solicita dos números reales y lleva a cabo los siguientes
 * cálculos: 1. El triple del primer número. 2. La décima parte del segundo
 * número. 3. El cuadrado del doble del producto de ambos números. 4. La mitad
 * del cuadrado de la suma de ambos.
 *
 * @author Juan Francisco Rodríguez Berenguel
 */
public class calculos {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---------------------------------------------
        //          Declaración de variables 
        //---------------------------------------------
        // Constantes
        // Variables de entrada
        double numero1, numero2;

        // Variables de salida
        double triplePrimero, decimoSegundo, cuadradoDobleProducto, mitadCuadradoSuma;

        // Variables auxiliares
        double dobleProducto, suma;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //--------------------------------------------
        //                Entrada de datos 
        //--------------------------------------------
        System.out.println("CÁLCULOS ARITMÉTICOS");
        System.out.println("--------------------");
        System.out.println("Introduzca dos números reales: ");
        System.out.println("Primer número: ");
        numero1 = teclado.nextDouble();
        System.out.println("Segundo número: ");
        numero2 = teclado.nextDouble();

        //--------------------------------------------
        //                Procesamiento
        //--------------------------------------------
        //Triple del primer número
        triplePrimero = 3.0 * numero1;

        //decimoSegundo
        decimoSegundo = numero2 / 10.0;

        //cuadrado del doble del producto de ambos números
        dobleProducto = 2 * numero1 * numero2;
        cuadradoDobleProducto = dobleProducto * dobleProducto;

        //mitad del cuadrado de la suma de ambos
        suma = numero1 + numero2;
        mitadCuadradoSuma = (suma * suma) / 2.0;

        //--------------------------------------------
        //                Salida de resultados
        //--------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Triple del primer número: " + triplePrimero);
        System.out.println("Décima parte del segundo núemro: " + decimoSegundo);
        System.out.println("Cuadrado del doble del producto de ambos números: " + cuadradoDobleProducto);
        System.out.println("Mitad del cuadrado de la suma de ambos números: " + mitadCuadradoSuma);
        
        teclado.close();
    }

}
