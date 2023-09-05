package minutos;

import java.util.Scanner;


public class Minutos {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los minutos del viaje");
        int acomulador =0;
        int minutos = 1;

        while (minutos > 0){

            minutos =sc.nextInt();
            acomulador = minutos + acomulador;

        }
        int totalMinutos =acomulador;

        int horas = totalMinutos / 60;
        int totalFinal= totalMinutos % 60;
        System.out.println("El total de del tiempo fue " + horas + ":" + totalFinal);
    }

}