import java.util.Scanner;

public class bucles {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres que cuente?");
        int numero;
        numero = sc.nextInt();
        int contador = 0;
        

        while (contador < numero) {
            contador = contador + 1;
            System.out.println(contador);
            //System.out.println("-> " + contador);
        }
        System.out.println("Dime otro número");
        int numero2 =  sc.nextInt();
        contador = numero2;

        do  {
            contador = contador -1;
            System.out.println(contador);
            //System.out.println("-> " + contador);
        } while (contador > 1);
    }
}
