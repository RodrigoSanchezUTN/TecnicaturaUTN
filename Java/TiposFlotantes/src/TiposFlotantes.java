public class TiposFlotantes {

    public static void main(String[] args) {

        float numFloat = 3.4028235E38f;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor mínimo de float: " + Float.MIN_VALUE);
        System.out.println("El valor máximo de float: " + Float.MAX_VALUE);

        double numDouble = -1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor mínimo de double: " + Double.MIN_VALUE);
        System.out.println("El valor máximo de double: " + Double.MAX_VALUE);
    }
}