import java.util.Random;
import java.util.Scanner;

public class ordenadoraciertanumero {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int limite_inferior = 1;
        int limite_superior = 100;
        int ordenador_piensa;
        char respuesta;
        
        do {
        ordenador_piensa = rd.nextInt(limite_inferior, limite_superior+1);
        System.out.println("He pensado el: " + ordenador_piensa + " ¿He acertado? (=,m,y)");
        respuesta = sc.next().charAt(0);
        if (respuesta == '=') {
            System.out.println("Has acertado");
        } 
        else if (respuesta == 'm') {

            limite_superior = ordenador_piensa;
            System.out.println("El número es menor");
        }
        else {

            limite_inferior = ordenador_piensa;
            System.out.println("El número es mayor");
        }
    } while (respuesta != '=');

        
    }
}
