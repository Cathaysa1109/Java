import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int valor =3;
        int acumulado_suma=0;
        do{

            System.out.print("Pon un valor:");
            valor = sc.nextInt();
            System.out.println("valor" + valor);
            acumulado_suma = acumulado_suma + valor;
            System.out.println("Acumulado -> " + acumulado_suma);
        } while (valor!=0);

        System.out.println("Salida");

    }
}
