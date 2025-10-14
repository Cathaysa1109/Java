import java.util.Random;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        int aleatorio;
        boolean negativo = false;
        for (int i = 0; i <= 4; i++); {
            aleatorio = rd.nextInt(-5,6);
            System.out.println("->" + aleatorio);
            if (aleatorio < 0) {
                negativo = true;
            }
        }
        if (negativo ==true) {
            System.out.println("Alguno era negativo");
        } else {
            System.out.println("Todos no eran negativos");
        }
    }
}
