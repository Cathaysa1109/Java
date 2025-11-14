public class Librería {
    public static void main(String[] args) throws Exception {
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
}
