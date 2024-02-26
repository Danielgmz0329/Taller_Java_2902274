package co.edu.sena_2902274;

import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        // Entradas
        System.out.println("4. Cálculo de la longitud y área de una circunferencia, y área de un círculo inscrito");
        System.out.println("Ingrese el radio de la circunferencia:");

        Scanner src = new Scanner(System.in);
        double radio = src.nextDouble();

        // Proceso
        double longitudCircunferencia = 2 * Math.PI * radio;
        double areaCircunferencia = Math.PI * Math.pow(radio, 2);
        double areaCirculoInscrito = Math.PI * Math.pow(radio, 2) / 2;

        // Salidas
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
        System.out.println("El área de la circunferencia es: " + areaCircunferencia);
        System.out.println("El área del círculo inscrito es: " + areaCirculoInscrito);

        src.close();
    }
}
