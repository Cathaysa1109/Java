import java.util.Random;
import java.util.Scanner;

public class EjercicioFunciones {
    public static void main(String[] args) throws Exception {

        int carta, pal; 
        double puntsJugador =0, puntos_cartas, puntsBanca = 0;

        do {

            carta = numero_carta_aleatori();
            pal = pal_carta_aleatori();
            imprimir_carta(carta, pal);
            puntos_cartas = puntos_cartas(carta);
            puntsJugador = puntsJugador + puntos_cartas;

            System.out.println("Puntos del jugador: " + puntsJugador);

        } while (plantarse()=='n');

        do {
            carta = numero_carta_aleatori();
            pal = pal_carta_aleatori();
            System.out.println("La banca saca ");
            imprimir_carta(carta, pal);
            puntos_cartas = puntos_cartas(carta);
            puntsBanca = puntsBanca + puntos_cartas;

            System.out.println("Puntos de la banca: " + puntsBanca + " te has plantado en " + puntsJugador);
        } while (banca_demana_carta(puntsJugador, puntsBanca));
    }

        public static int numero_carta_aleatori() {
        Random rd = new Random();
        int numero_aleatori = rd.nextInt(1,11);
        
        if (numero_aleatori == 8) {
            numero_aleatori = 10;
        }
        if (numero_aleatori == 9) {
            numero_aleatori = 11;
        }
        if (numero_aleatori == 10) {
            numero_aleatori = 12;
        }
        return numero_aleatori;
    
    }

    public static int pal_carta_aleatori(){
        Random rd = new Random();
        int num_aleatori_pal = rd.nextInt(1,5);
        return num_aleatori_pal;
    }

    public static void imprimir_carta(int numero_carta_aleatori, int pal_carta_aleatori){

        String nombre_carta;
        String nombre_palo = "";


        if (pal_carta_aleatori == 1) {
            nombre_palo = "OROS";
        } else if (pal_carta_aleatori == 2) {
            nombre_palo = "BASTOS";
        } else if (pal_carta_aleatori == 3) {
            nombre_palo = "ESPADAS";
        } else if (pal_carta_aleatori == 4) {
            nombre_palo = "COPAS";
        }

        if (numero_carta_aleatori == 10) {
            nombre_carta = "SOTA";
        } else if (numero_carta_aleatori == 11) {
            nombre_carta = "CABALLO";
        } else if (numero_carta_aleatori == 12) {
            nombre_carta = "REY";
        } else {
            nombre_carta = Integer.toString(numero_carta_aleatori);
        }
        
        System.out.println("La carta es " + nombre_carta + " de " + nombre_palo);
        
    }

    public static double puntos_cartas(int numero_carta) {
        if (numero_carta >= 1 && numero_carta <= 7) {
            return numero_carta;
        } else if (numero_carta == 10 || numero_carta == 11 || numero_carta == 12) {
            return 0.5;
        } return 0;
    }

    public static boolean banca_demana_carta(double punts_jugador, double punts_banca){
        if (punts_jugador <= 7.5 && punts_banca > punts_jugador) {
            return true;
        } else if (punts_banca < 5) {
            return true;
        } return false;
    }

    public static boolean guanya_jugador(double punts_jugador, double punts_banca){
        if (punts_jugador <= 7.5 && punts_jugador > punts_banca) {
            return true;
        } else if (punts_banca > 7.5) {
            return true;
        } return false;
    }

    public static int plantarse() {

        Scanner sc = new Scanner(System.in);
        char jugador_se_planta;

        do {

        System.out.println("¿Quieres plantarte? (S/N) ");
        jugador_se_planta = sc.next().charAt(0);

        }

        while (jugador_se_planta != 's' && jugador_se_planta != 'n'); 
        return jugador_se_planta;
        
    }
}