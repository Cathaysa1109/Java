import java.util.Random;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        /*Generar 10 números entre 100 y 200
         * Sumar los pares
         * Sumar los impares
         * 
         */
        Random rd = new Random();
        int aleatorio;
        int pares = 0;
        int impares =0;
        int contador;

        for (contador = 1; contador <= 10; contador++) {
            aleatorio = rd.nextInt(100,201);
            System.out.println("->" + aleatorio);
            if (aleatorio % 2 ==0) { //---%2 ==0--- es dividir entre pares e impares (se llama OPERADOR DE MÓDULOS)
                pares = pares += aleatorio;
            } else {
                impares = impares += aleatorio;
            }
    }
            System.out.println("Suma de par " + pares + " Suma de impares " + impares);
}
}
