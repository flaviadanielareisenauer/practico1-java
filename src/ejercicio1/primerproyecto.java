package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Flavia
 */
public class primerproyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nroLegajo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Me dices tu número de legajo?");
        nroLegajo = entrada.nextInt();
        System.out.println("Ingreso de " + nroLegajo + " al Netbeans!");
    }
}