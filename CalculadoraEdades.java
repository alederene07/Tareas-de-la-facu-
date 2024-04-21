import java.util.Scanner;

public class CalculadoraEdades {
    private int[] edades;

    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }
    public double calcularPromedioMayoresEdad() {
        int sum = 0;
        int count = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                sum += edad;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
    public double calcularPromedioMenoresEdad() {
        int sum = 0;
        int count = 0;
        for (int edad : edades) {
            if (edad < 18) {
                sum += edad;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas en el grupo: ");
        int cantidadPersonas = scanner.nextInt();
        int[] edades = new int[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }
        CalculadoraEdades calculadora = new CalculadoraEdades(edades);
        double promedioMayoresEdad = calculadora.calcularPromedioMayoresEdad();
        double promedioMenoresEdad = calculadora.calcularPromedioMenoresEdad();

        System.out.println("El promedio de edades de los mayores de edad es: " + promedioMayoresEdad);
        System.out.println("El promedio de edades de los menores de edad es: " + promedioMenoresEdad);

        scanner.close();
    }
}
