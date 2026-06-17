
package ConversorHoras;

import java.util.Scanner;


public class ConversorHoras {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de horas: ");
        int horasTotales = entrada.nextInt();

        int semanas = horasTotales / (7 * 24);
        int restoHoras = horasTotales % (7 * 24);

        int dias = restoHoras / 24;
        int horas = restoHoras % 24;

        System.out.println("Equivale a:");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " días");
        System.out.println(horas + " horas");

        entrada.close();
    }
} 

