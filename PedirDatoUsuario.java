import java.util.Scanner;

public class PedirDatoUsuario {

     /*función que devuelve solo el valor introducido por el usuario siempre que sea positivo
      * @param frase String que se mostrará al usuario
      
      */
    public static int pedirDatoPositivo(String frase) {
        
        int valor;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(frase);
            valor = sc.nextInt();
        } while (valor < 0);
        return valor;

    }
}

    public static void PpruebasMath()
    {
        //Llibreria Math
        double numeroPi = Math.PI;
        double calculo = numeroPi * 2;
        System.out.println(numeroPi + "-" + calculo);
        double numero = -7;
        double numero_absoluto = Math.abs(numero);
        System.out.println(numero_absoluto);

    
        double raiz_cubica = Math.cbrt(10);
        System.out.println(raiz_cubica);

        int v1 = 5, v2 =9;
        int mínimo = Math.min(v1, v2);

        double n = 3;
        double signo = Math.signum(n);
        System.out.println(signo);
        System.out.println("Angulo tangente " + Math.tan(60));
}

