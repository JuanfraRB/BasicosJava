package Operaciones;

import java.util.Scanner;

/**
 * Trayecto en dos etapas.
 *
 * @author Juan Francisco Rodríguez Berenguel
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--------------------------------------------
        //          Declaración de variables 
        //--------------------------------------------

        //Constantes
        final double COEFICIENTE_CONSUMO1 = 1.0 / 2;      //0.50
        final double COEFICIENTE_CONSUMO2 = 25.0 / 100;   //0.25

        //Variables de entrada
        double litrosInicialesDeposito;

        //Variables Salida
        double consumoPrimerRecorrido;
        double consumoSegundoRecorrido;

        //Variables auxiliares
        double litrosActualesDeposito;

        //clase Scanner para datos de entradaç
        Scanner teclado = new Scanner(System.in);

        //--------------------------------------------
        //                Entrada de datos 
        //--------------------------------------------
        System.out.println("TRAYECTO EN DOS ETAPAS");
        System.out.println("----------------------");
        System.out.println("Introduzca la cantidad de litros que se introducen en el depósito del vehiculo: ");
        litrosInicialesDeposito = teclado.nextDouble();

        //--------------------------------------------
        //                Procesamiento
        //--------------------------------------------
        //Iniciamos
        litrosActualesDeposito = litrosInicialesDeposito;

        //Cálculo consumo primer recorrido
        consumoPrimerRecorrido = litrosActualesDeposito * COEFICIENTE_CONSUMO1;

        //Actualización de la cantidad que queda en el depósito
        litrosActualesDeposito -= consumoPrimerRecorrido;

        //Calculo del consumo del segundo recorrido
        consumoSegundoRecorrido = litrosActualesDeposito * COEFICIENTE_CONSUMO2;

        //Actualización cantidad restante del depósito
        litrosActualesDeposito -= consumoSegundoRecorrido;

        //--------------------------------------------
        //                Salida de resultados
        //--------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("----------");
        System.out.println("Litros consumidos primer recorrido: " + consumoPrimerRecorrido);
        System.out.println("Litros consumidos segundo recorrido: " + consumoSegundoRecorrido);
        System.out.println("Litros sobrantes: " + litrosActualesDeposito);

        teclado.close();
    }

}
