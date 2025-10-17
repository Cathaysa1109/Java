import java.util.Scanner;

public class Ex2Reforçv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int pin_tarjeta = 1234;
        int pin_usuario;
        //int contador =0;
        int intentos =3;
        System.out.print("¿Cuál es el PIN?"); 
        
         do {
        pin_usuario = sc.nextInt();
        //contador++;
        if (pin_usuario != pin_tarjeta) {

            intentos--;
            System.out.println("El PIN es erróneo.");
        }
        else {
            System.out.println("Correcto, el pin es " + pin_tarjeta + ".");
        } 
      } while (intentos > 0 &&  pin_tarjeta != pin_usuario);

          if (pin_usuario == pin_tarjeta) {
            System.out.println("Puedes sacara dinero.");
      }
      else {
        System.out.println("Demasiados intentos. Se ha bloqueado la tarjeta");
      }
    

    }
}
