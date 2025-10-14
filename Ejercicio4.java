import java.util.Scanner;

public class Ejercicio4 {

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    
        System.out.println("¿Hasta qué número quieres que cuente?");
        int numero = sc.nextInt();
        int contador = 1;

    while (contador <= numero) {

            System.out.println(contador);
            contador = contador + 1;
            
        } 
}
   }