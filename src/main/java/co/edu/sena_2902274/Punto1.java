
    package co.edu.sena_2902274;

    import java.util.Scanner;
    
    public class Punto1 {
        public static void main(String[] args) {
            // Entradas
            System.out.println("1. Calcular el área de un triángulo");
            System.out.println("Ingrese la base del triángulo: ");
    
            Scanner src = new Scanner(System.in);
            double base = src.nextDouble();
    
            System.out.println("Ingrese la altura del triángulo: ");
            double altura = src.nextDouble();
    
            // Proceso
            double resultado = (base * altura) / 2;
    
            // Salida
            System.out.println("El área del triángulo es: " + resultado);
    
            src.close();
        }
    }
    

