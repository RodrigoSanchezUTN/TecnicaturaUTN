import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float num1, num2, mayor;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextFloat();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextFloat();

        mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El número mayor es: " + mayor);
    }
}