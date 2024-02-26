
package co.edu.sena_2902274;

import java.util.Scanner;

public class Punto5{
    public static void main(String[] args) {
         //Entradas
         System.out.println("5. Área y perímetro de un cuadrado:");
         System.out.println("Ingrese un valor para un lado del cuadrado: ");
 
         Scanner valor = new Scanner(System.in);
         double lado = valor.nextDouble();
 
         //Proceso
         double area = (lado*lado);
         double perimetro = (lado+lado+lado+lado);
         //Salida
         System.out.println("El área del cuadrado es: "+area);
         System.out.println("El perímetro del cuadrado es: "+perimetro);

       
    }
}


