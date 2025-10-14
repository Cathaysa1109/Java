import java.util.Random;

public class numerosaleatorios {
    public static void main(String[] args) throws Exception {
        
        //Generar un valor aleatorio del 1 al 10

        Random rd = new Random();
        int aleatorio;
        for (int i = 0; i < 10; i++); {
            aleatorio = rd.nextInt(1,11);
            System.out.println(aleatorio);
        }

        //Generar 10 aleatorios del 15 al 36

        for (int i = 0; i < 10; i++); {
            aleatorio = rd.nextInt(15,36);
            System.out.println(aleatorio);
        }

        // generar 10 aleatorios del -10 al 0 incluído
         
        for (int i = 0; i < 10; i++); {
            aleatorio = rd.nextInt(-10,1);
            System.out.println(aleatorio);
        }

        //Generar 15 aleatorios con decimales del 1 al 10
        System.out.println("Generar 15 aleatorios con decimales del 1 al 10");
        double aleatorio_double;
        for (int i = 0; i < 15; i++); {
            aleatorio_double = rd.nextDouble(1,10);
            System.out.println(aleatorio_double);
        }

    }
}
