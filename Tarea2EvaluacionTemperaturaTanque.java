import java.util.Scanner;

public class EvaluacionTemperaturaTanque {

    public static void main(String[] args) {

        double[][] valoresPredeterminados = {
            
            {0,10, 20},  // mañana
            {20, 30, 40},  // tarde
            {30, 20, 10}   // noche
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el momento del día (mañana, tarde, noche):");
        String momentoDia = scanner.nextLine().toLowerCase();
        System.out.println("Ingrese la temperatura actual del tanque de combustible:");
        double temperatura = scanner.nextDouble();
        
        int indiceMomentoDia;
        switch (momentoDia) {
            case "mañana":
                indiceMomentoDia = 0;
                break;
            case "tarde":
                indiceMomentoDia = 1;
                break;
            case "noche":
                indiceMomentoDia = 2;
                break;
            default:
                System.out.println("El momento del día ingresado no es válido.");
                return;
        }

        
        String estado = "";
        if (temperatura < valoresPredeterminados[indiceMomentoDia][0])
            estado = "Muy Buena";
        else if (temperatura >= valoresPredeterminados[indiceMomentoDia][1] && temperatura <= valoresPredeterminados[indiceMomentoDia][2])
            estado = "Normal";
        else
            estado = "Peligrosa";
        System.out.println("La temperatura del tanque de combustible es: " + estado + " para la " + momentoDia + ".");
    }
}
