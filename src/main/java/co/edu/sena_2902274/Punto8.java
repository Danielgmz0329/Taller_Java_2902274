package co.edu.sena_2902274;

import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) {
        // Entradas
        System.out.println("4. Cálculo del promedio de tres números");
        System.out.println("Ingrese el primer número:");
        
        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double num2 = src.nextDouble();
        
        System.out.println("Ingrese el tercer número:");
        double num3 = src.nextDouble();
        
        // Proceso
        double promedio = (num1 + num2 + num3) / 3;
        
        // Salida
        System.out.println("El promedio de los tres números es: " + promedio);
        
        src.close();
    }
}
