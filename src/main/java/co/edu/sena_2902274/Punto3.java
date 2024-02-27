
package co.edu.sena_2902274;

import java.util.Scanner;

public class Punto3{
    public static void main(String[] args) {
        // Entradas
        System.out.println("3. Número elevado al cuadrado");
        System.out.println("Ingrese el número que desea elevar al cuadrado: ");

        Scanner src = new Scanner(System.in);
        double a = src.nextDouble();

        // Proceso
        double resultado = (a*a);

        // Salida
        System.out.println("El resultado del número es: "+resultado);

        src.close();
    }
}


