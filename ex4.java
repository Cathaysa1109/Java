import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Un programa que pida números
        //y cuente cuantos positivos has escrito
        //para terminar tienes que poner 0

        System.out.println("Dime un número");
        int numero;
        int contadorPositivo =0;

        do {
            System.out.println("Poner un número (si pones 0 sale)");
            numero = sc.nextInt();
            if (numero >0) {
                contadorPositivo++;
            }
            
        } while (numero!=0);

        System.out.println("Contadores positivos " + contadorPositivo);
        System.out.println("Has salido del programa");
    


    }
}
