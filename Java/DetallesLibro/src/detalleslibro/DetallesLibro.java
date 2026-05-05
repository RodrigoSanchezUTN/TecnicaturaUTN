package detalleslibro;
import java.util.Scanner;


public class DetallesLibro {
    public static void main(String[] args) {
        
      
        Scanner entrada = new Scanner(System.in);
        
      
        System.out.print("Proporciona el título: ");
        String nombreLibro = entrada.nextLine();
        
       
        System.out.print("Proporciona el autor: ");
        String nombreAutor = entrada.nextLine();
        

        System.out.println(nombreLibro + " fue escrito por " + nombreAutor);
    
        entrada.close();
    }
}

