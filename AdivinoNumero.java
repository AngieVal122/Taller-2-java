import java.util.Random;
import java.util.Scanner;

class AdivinoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max = 100, min = 0, contador = 0;
        Random random = new Random();
        int secreto = random.nextInt(100 + 1);

        do {
            System.out.println("Ingrese su jugada entre " + min + " y " + max);
            n = sc.nextInt();
            contador++;
            System.out.println("intento " + contador);
            if (n <= min || n >= max) {
                System.out.println("PERDIO");
                break;}
            if (n == secreto)
                System.out.println("Felicitaciones ");
            else {
                if (n > secreto) {
                    max = n;
                    System.out.println("EL SECRETO ES MENOR");
                } else {
                    min = n;
                    System.out.println("EL SECRETO ES MAYOR");

                }

            }
            System.out.println("intentos: " + contador);
        }while (n != secreto && n >= min && n <= max) ;
        if (n == secreto)
            System.out.println("Felicitaciones ");
        else
            System.out.println("PERDIO");

    }}