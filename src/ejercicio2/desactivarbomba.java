package ejercicio2;

import java.util.Scanner;

public class desactivarbomba {

    public static void main(String[] args) {
        System.out.print("Ingresa por favor el codigo que desactiva la bomba (3 digitos): ");

        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();

        int tercerNumero = codigo % 10;
        codigo /= 10;
        int segundoNumero = codigo % 10;
        codigo /= 10;
        int primerNumero = codigo;

        if (primerNumero >= 1 && primerNumero <= 9 && segundoNumero >= 0 && tercerNumero >= 0) {
    
            System.out.println("El código de desactivación real es " + tercerNumero + "-" + segundoNumero + "-" + primerNumero);
        } else {
            System.out.println("El número ingresado no es un entero positivo de 3 cifras.");
        }

        scanner.close();
    }
}

/* 
Otra alternativa:
package bomba;
import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) {
    
    int codigo, primero,segundo, tercero;
    Scanner entrada = new Scanner(source:System.in);

    System.out.println("Ingrese el codigo de desactivacion de la bomba:");
    codigo=entrada.nextInt();
    
    tercero = codigo%10;
    segundo = (codigo/10)%10;
    primero = (codigo/100)%10;

    System.out.println("Primero:" + primero);
    System.out.println("Segundo:" + segundo);
    System.out.println("Tercero:" + tercero);

    System.out.println("El codigo de desactivacion real es: " + tercero + "-" + segundo + "-" + primero);
    }
}
*/
