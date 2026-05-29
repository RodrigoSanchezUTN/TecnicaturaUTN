import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, suma;

        System.out.print("Ingrese la primera calificación: ");
        n1 = sc.nextFloat();

        System.out.print("Ingrese la segunda calificación: ");
        n2 = sc.nextFloat();

        System.out.print("Ingrese la tercera calificación: ");
        n3 = sc.nextFloat();

        suma = n1 + n2 + n3;

        System.out.println("La suma es: " + suma);
    }
}