package TuteConSwitch;

import java.util.Scanner;

/**
 * Valor de un naipe en el juego del tute.
 * 
 * @author Juan Francisco Rodríguez Berenguel
 */
public class tute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        byte VALOR_AS=      11;
        byte VALOR_TRES=    10;
        byte VALOR_SOTA=     2;
        byte VALOR_CABALLO=  3;
        byte VALOR_REY=      4;
        byte VALOR_OTROS=    0;
        byte VALOR_ERROR=   -1;
        
        // Variables de entrada
        byte numero;
        
        // Variables de salida
        byte valorNaipe;
        
        // Variables auxiliares

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("VALOR DE UN NAIPE EN EL TUTE");
        System.out.println("----------------------------");
        System.out.print("Introduzca número (1-7, 10-12): ");
        numero = teclado.nextByte();
        
         //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // En función del número se calcula el valor del naipe
        switch (numero) {
            case 1:  
                valorNaipe= VALOR_AS;
                break;
            case 3:
                valorNaipe= VALOR_TRES;
                break;
            case 10:
                valorNaipe= VALOR_SOTA;
                break;
            case 11:
                valorNaipe= VALOR_CABALLO;
                break;
            case 12:
                valorNaipe= VALOR_REY;
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                valorNaipe= VALOR_OTROS;
                break;
            default: // Cualquier otro valor
                valorNaipe = VALOR_ERROR;
        }
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El valor del naipe con ese número es: " + valorNaipe);
        
        teclado.close();
    }
    
}
