package AnalisisAnho;

import java.util.Scanner;

/**
 * Análisis de un año
 *
 * @author Juan Francisco Rodríguez Berenguel
 */
public class anho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        final int ANYO_MINIMO = 1801;
        final int ANYO_MAXIMO = 2100;
        final int ANYO_ACTUAL = 2026;

        // Variables de entrada
        int anyo;

        // Variables de salida
        String mensajeSalida = "ERROR";
        String siglo = "ERROR";
        int diferencia;

        // Variables auxiliares
        boolean anyoValido = true;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DEL AÑO");
        System.out.println("----------------");
        System.out.print("Introduzca un año (entre 1801-2100): ");
        anyo = teclado.nextInt();

        // Comprobación de que se trata de un año válido
        if (anyo < ANYO_MINIMO || anyo > ANYO_MAXIMO) {
            anyoValido = false;
        }

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------       
        // Sólo si el año es válido llevamos a cabo comprobaciones y cálculos
        if (anyoValido) {
            // Comprobación del siglo
            if (anyo >= ANYO_MINIMO && anyo < ANYO_MINIMO + 100) {
                siglo = "XIX";
            } else if (anyo >= ANYO_MINIMO + 100 && anyo < ANYO_MINIMO + 200) {
                siglo = "XX";
            } else { // Si no es ninguno de los anteriores, es el siglo XXI. Si no, no sería un año válido                
                siglo = "XXI";
            }
            // Cálculo de la distancia respecto al año actual
            diferencia = ANYO_ACTUAL - anyo;
            if (diferencia < 0) { // El año es posterior al año actual (futuro)
                diferencia *= -1;
                mensajeSalida = "es posterior al actual. Faltan " + diferencia + " años.";
            } else if (diferencia > 0) {
                mensajeSalida = "es anterior al actual. Han pasado " + diferencia + " años.";
            } else {
                mensajeSalida = "coincide con el actual.";
            }
        }

        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        if (anyoValido) {
            System.out.println("El año introducido " + mensajeSalida);
            System.out.println("El año pertenece al siglo " + siglo + ".");
        } else {
            System.out.println("El año introducido no es válido.");
        }
        
        teclado.close();
    }

}
