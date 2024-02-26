
package co.edu.sena_2902274;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        // Entradas
        System.out.println("2. Sumatoria de dos números");
        System.out.println("Ingrese el primer número: ");

        Scanner src = new Scanner(System.in);
        double a = src.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double b= src.nextDouble();

        // Proceso
        double resultado = (a+b);

        // Salida
        System.out.println("La sumatoria de los números es: " + resultado);

        src.close();
    }
}


