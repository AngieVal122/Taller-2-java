import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lamediana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicitar números al usuario hasta que ingrese "."
        while (true) {
            System.out.print("Ingrese un número entero o '.' para finalizar: ");
            String entrada = scanner.next();

            if (entrada.equals(".")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número entero válido o '.' para finalizar.");
            }
        }

        // Ordenar la lista de números
        Collections.sort(numeros);

        int n = numeros.size();
        int mediana;

        if (n % 2 == 1) {
            // Si la cantidad de números es impar, tomar el número en la mitad
            mediana = numeros.get(n / 2);
        } else {
            // Si la cantidad de números es par, tomar el promedio de los dos números en la mitad
            int num1 = numeros.get(n / 2 - 1);
            int num2 = numeros.get(n / 2);
            mediana = (num1 + num2) / 2;
        }

        // Imprimir la mediana
        System.out.println("La mediana es " + mediana + ".");
    }
}