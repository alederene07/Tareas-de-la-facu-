

import java.util.Scanner;

public class ClasificacionEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaMayores = 0;
        int cantidadMayores = 0;
        int sumaMenores = 0;
        int cantidadMenores = 0;
        for (int i = 1; i <= 5; i++){
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = scanner.nextInt();
            
            
            if (edad >= 18){
                sumaMayores += edad;
                cantidadMayores++;
            } else {
                sumaMenores += edad;
                cantidadMenores++;
            }
        }
        double promedioMayores = cantidadMayores > 0 ? (double) sumaMayores / cantidadMayores : 0;
        double promedioMenores = cantidadMenores > 0 ? (double) sumaMenores / cantidadMenores : 0;
        System.out.println("Promedio mayores de edad: " + promedioMayores);
        System.out.println("Promedio menores de edad: " + promedioMenores);
        scanner.close();
    }
}
