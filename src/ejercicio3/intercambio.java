package ejercicio3;
import java.util.Scanner;


public class intercambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el valor de b: ");
        int b = scanner.nextInt();

        System.out.println("--Intercambiamos a y b--");
        // Se utiliza la variable temporal para no perder el dato al sobreescribir otra variable

        // Guardamos el valor de A en temporal
        int temporal = a;

        // Guardamos en A el valor de B
        a = b;

        // Guardamos en B el valor que tenia A (reservado en temporal)
        b = temporal;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        scanner.close();
    }    
}