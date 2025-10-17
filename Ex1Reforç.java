import java.util.Scanner;

public class Ex1Reforç {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Por qué número empiezo?");
        int num = sc.nextInt();
        int contador_multiples = 0;
        do {
            if (num % 7 == 0) {

                System.out.println(num);
                contador_multiples++; // es el que encuentra y dice cuando se para
            }
            num++;
        } while (contador_multiples < 10);
    }
}
