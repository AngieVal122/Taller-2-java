import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingrese varios valores, termine con cero:");

        while (true) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            } else if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        // Imprimir el histograma de valores positivos
        System.out.print("Positivos: ");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Imprimir el histograma de valores negativos
        System.out.print("Negativos: ");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}