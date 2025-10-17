import java.util.Random;
import java.util.Scanner;

public class Ex2Reforç {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int ordenador_piensa_pin = rd.nextInt(1111,1235);
        int numero, contador = 0;
        System.out.print("¿Cuál es el PIN? (Entre 1111 y 1234)"); 
        
         do {
        numero = sc.nextInt();
        contador++;
        if (numero < ordenador_piensa_pin) {
            System.out.println("El PIN es erróneo (es más grande).");
        }
        else if (numero > ordenador_piensa_pin) {
            System.out.println("El PIN es erróneo (es más pequeño).");
        }
        else if (numero == ordenador_piensa_pin) {
            System.out.println("Correcto, el pin es " + ordenador_piensa_pin + ".");
        } 
      } while (numero != ordenador_piensa_pin && contador <= 3);

          if (numero == ordenador_piensa_pin) {
            System.out.println("Puedes sacara dinero.");
      }
      else {
        System.out.println("Demasiados intentos. Se ha bloqueado la tarjeta");
      }
    

    }
}
