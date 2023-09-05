import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingrese valores enteros y termine con cero:");

        while (true) {
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();

                if (numero == 0) {
                    break;
                } else if (numero > 0) {
                    positivos++;
                } else {
                    negativos++;
                }

            }else {
                System.out.println("Recuerde ingresar numeros enteros");
                scanner.next();
            }
        }

        System.out.print("Positivos: ");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("Negativos: ");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}