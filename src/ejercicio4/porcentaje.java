package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Flavia
 */
public class porcentaje {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad de mujeres: ");
        int cantMujeres = scanner.nextInt();

        System.out.print("Ingrese cantidad de varones: ");
        int cantVarones = scanner.nextInt();


        int totalAlumnos = cantMujeres + cantVarones;

        int porcentajeMujeres = (cantMujeres * 100) / totalAlumnos;
        int porcentajeVarones = (cantVarones * 100) / totalAlumnos;

        System.out.println("En la comisión hay un " + porcentajeMujeres + "% de mujeres y un " + porcentajeVarones + "% de varones.");

        scanner.close();
    }
}

/*
Otras formas de escribir el mismo codigo -version 1
package guia1;

import java.util.Scanner;

public class Guia1Ejercicio4v1 {

    public static void main(String[] args) {
        int mujeres, hombres;
        int total;
        Scanner entrada = new Scanner( System.in );
        
        System.out.println("Ingrese cantidad de mujeres:");
        mujeres=entrada.nextInt();
        
        System.out.println("Ingrese cantidad de varones:");
        hombres=entrada.nextInt();
        
        total = mujeres + hombres;
        
        System.out.println("En la comision hay un " + mujeres*100/total + "% de mujeres y un " + hombres*100/total + "% de varones.");
        // si la operacion se realiza primero division y luego multiplicar por 100, al utilizar variables int el resultado serà 0%
        // para solucionar este inconveniente la variable "total" podria haberse declarado como tipo double
    }
    
}
*/

/*
version 2
package guia1;

import java.util.Scanner;

public class Guia1Ejercicio4v2 {

    public static void main(String[] args) {
        int mujeres, hombres;
        int total;
        Scanner entrada = new Scanner( System.in );
        
        System.out.println("Ingrese cantidad de mujeres:");
        mujeres=entrada.nextInt();
        
        System.out.println("Ingrese cantidad de varones:");
        hombres=entrada.nextInt();
        
        total = mujeres + hombres;
        
        System.out.println("En la comision hay un " + mujeres*100.0/total + "% de mujeres y un " + hombres*100.0/total + "% de varones.");
        // se opera con 100.0 que es un nro decimal, por lo tanto el total se muestra con decimales
    }
    
}
*/