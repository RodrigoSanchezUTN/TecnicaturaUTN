import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final float SALARIO = 1000;

        int cantidadCarros;
        float valorCarro, totalVentas = 0, comision, total;

        System.out.print("Ingrese la cantidad de carros vendidos: ");
        cantidadCarros = sc.nextInt();

        for (int i = 1; i <= cantidadCarros; i++) {

            System.out.print("Ingrese el valor del carro " + i + ": ");
            valorCarro = sc.nextFloat();

            totalVentas = totalVentas + valorCarro;
        }

        comision = (150 * cantidadCarros) + (totalVentas * 0.05f);

        total = SALARIO + comision;

        System.out.println("El salario total es: " + total);
    }
}