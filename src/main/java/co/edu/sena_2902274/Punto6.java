package co.edu.sena_2902274;

import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        // Entradas
        System.out.println("4. Cálculo del área y volumen de un cilindro");
        System.out.println("Ingrese el radio del cilindro:");

        Scanner src = new Scanner(System.in);
        double radio = src.nextDouble();

        System.out.println("Ingrese la altura del cilindro:");
        double altura = src.nextDouble();

        // Proceso
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Salidas
        System.out.println("El área lateral del cilindro es: " + areaLateral);
        System.out.println("El área total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);

        src.close();
    }
}
