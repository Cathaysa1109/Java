import java.util.Random;

public class ejercicio7 {
        
    public static void main(String[] args) {
        
        Random rd = new Random();
        int aleatorio;
        int positivos = 0, negativos =0;
        int contador; // cantidad de numeros generados
        
        for (contador = 1; contador <= 10; contador++) {
            aleatorio = rd.nextInt(-3,11);
            System.out.println("->" + aleatorio);
            if (aleatorio < 0) { 
                ++negativos;
            } else  if (aleatorio>0)
            {
                positivos++;
        }
       
    }
     System.out.println( "negativos " + negativos + " positivos " + positivos);
}
}