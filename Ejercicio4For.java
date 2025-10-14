import java.util.Scanner;

public class Ejercicio4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador;

        System.out.println("¿Hasta qué número quieres que cuente?");
        int numero = scanner.nextInt();

        for (contador = 1; contador <=numero; contador++){
            System.out.println(contador);
        }
    }

}
