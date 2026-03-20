package Enum2;

/**
 *
 * @author Juan Francisco Rodríguez Berenguel
 */
public class enumeracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro una variable de tipo enum
        Enum provincia;
        //Empieza el programa
        System.out.println("Provincias de Andalucía");
        System.out.println("-----------------------");

        //Asigno a la variable un valor para imprimir por consola
        provincia = Enum.ALMERIA;
        /*Con System.out.println() se imprime por consola un texto,
        habrá ocasiones que según que tipo de variable no se podrá 
        imprimir por consola porque no es texto, con la doble comilla " 
        entiende que es texto y se añade(+) para imprimir la variable*/
        System.out.println("Provincia 1: " + provincia);

        provincia = Enum.CADIZ;
        System.out.println("Provincia 2: " + provincia);

        provincia = Enum.CORDOBA;
        System.out.println("Provincia 3: " + provincia);

        provincia = Enum.GRANADA;
        System.out.println("Provincia 4: " + provincia);

        provincia = Enum.HUELVA;
        System.out.println("Provincia 5: " + provincia);

        provincia = Enum.JAEN;
        System.out.println("Provincia 6: " + provincia);

        provincia = Enum.MALAGA;
        System.out.println("Provincia 7: " + provincia);

        //Otra forma de hacerlo
        provincia = Enum.valueOf("SEVILLA");
        System.out.println("Provincia 8: " + provincia);
    }
}
