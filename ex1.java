import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
             System.out.print("Dime un número:");
             numero = sc.nextInt();
             //System.out.println("numero " + numero);
        } while (numero != 0);
        
        System.out.println("Has salido del programa");

    }
}
