import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float base, altura, area, perimetro;

        System.out.print("Ingrese la base del rectángulo: ");
        base = sc.nextFloat();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = sc.nextFloat();

        area = base * altura;

        perimetro = 2 * (base + altura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}