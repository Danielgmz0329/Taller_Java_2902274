
package co.edu.sena_2902274;

import java.util.Scanner;

public class Punto4{
    public static void main(String[] args) {
        // Entradas
        System.out.println("4. Conversor de euros a dolares");
        System.out.println("Ingrese la cantidad de euros: ");

        Scanner src = new Scanner(System.in);
        double euros = src.nextDouble();

        // Proceso
        double resultado = (euros*1.082);

        // Salida
        System.out.println("El valor en dolares es: "+resultado);

        src.close();
    }
}


