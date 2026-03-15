package Enum;

/**
 * Primeros pasos con Java. enum será un tipo de dato que se utilizará para
 * definir un conjunto fijo de constates, como se ve en este ejercicio. Es una
 * alternativa, como se verá en sucesivos ejercicios, a "final".
 *
 * @author Juan Francisco Rodríguez Berenguel
 */
public class enumeracion {

    //Declaración del enum
    public enum ProvinciaAndalucia {
        ALMERIA, CADIZ, CORDOBA, GRANADA, HUELVA, JAEN, MALAGA, SEVILLA
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaro una variable de tipo enum
        ProvinciaAndalucia provincia;

        //Empieza el programa
        System.out.println("Provincias de Andalucía");
        System.out.println("-----------------------");

        //Asigno a la variable un valor para imprimir por consola
        provincia = ProvinciaAndalucia.ALMERIA;
        /*Con System.out.println() se imprime por consola un texto,
        habrá ocasiones que según que tipo de variable no se podrá 
        imprimir por consola porque no es texto, con la doble comilla " 
        entiende que es texto y se añade(+) para imprimir la variable*/
        System.out.println("Provincia 1: " + provincia);

        provincia=ProvinciaAndalucia.CADIZ;
        System.out.println("Provincia 2: " + provincia);

        provincia=ProvinciaAndalucia.CORDOBA;
        System.out.println("Provincia 3: " + provincia);

        provincia=ProvinciaAndalucia.GRANADA;
        System.out.println("Provincia 4: " + provincia);

        provincia=ProvinciaAndalucia.HUELVA;
        System.out.println("Provincia 5: " + provincia);

        provincia=ProvinciaAndalucia.JAEN;
        System.out.println("Provincia 6: " + provincia);

        provincia=ProvinciaAndalucia.MALAGA;
        System.out.println("Provincia 7: " + provincia);

        provincia=ProvinciaAndalucia.SEVILLA;
        System.out.println("Provincia 8: " + provincia);
    }

}
