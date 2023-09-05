import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            if (esPalindromo(numero)) {
                System.out.println(numero + " es un número palíndromo.");
            } else {
                System.out.println(numero + " no es un número palíndromo.");
            }
        } else {
            System.out.println("Recuerde, ingrese un número entero.");
        }
        scanner.close();
    }

    public static boolean esPalindromo(int numero) {
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroOriginal == numeroInvertido;
    }
}