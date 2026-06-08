
package Leccion2;


public class Leccion2 {
    public static void main(String[] args) {
        
   var condicion = true;
   if(condicion){
       System.out.println("Condicion verdadera");//c/s

   }
   else{
       System.out.println("Condicion Falsa");//c/d
   }
   var numero = 3;
     var numeroTexto = "Número desconocido";
             if(numero == 1){
                 numeroTexto = "Número uno";
             }
             else if(numero == 2){
                 numeroTexto = "Número dos";
             }
             else if(numero == 3){
                 numeroTexto = "Número tres";
             }
             else if(numero == 4){
                 numeroTexto = "Número cuatro";
             }
             else{
                 numeroTexto = "Número no encontrado";
             }
             System.out.println("numeroTexto = " + numeroTexto);

           }
}
