import java.util.Scanner;

import Modelo.*;

public class VistaConsola {

    private Scanner scanner;

    public static void main(String[] args) {
        VistaConsola app = new VistaConsola();
        app.run();
    }

    public void run() {
        scanner = new Scanner(System.in);

        System.out.print("Introdueix capacitat màxima del repositori: ");
        int capacitat = scanner.nextInt();

        RepositoriProductesDAO repositori = new RepositoriProductesDAO(capacitat);

        int opcio;

        do {
            mostrarMenu();
            opcio = scanner.nextInt();

            switch (opcio) {
                case 1:
                    afegirProducte(repositori);
                    break;
                case 2:
                    llistarProductes(repositori);
                    break;
                case 3:
                    cercarProducte(repositori);
                    break;
                case 4:
                    eliminarProducte(repositori);
                    break;
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }

        } while (opcio != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- GESTIÓ DE PRODUCTES ---");
        System.out.println("1. Afegir producte");
        System.out.println("2. Llistar productes");
        System.out.println("3. Cercar producte per ID");
        System.out.println("4. Eliminar producte");
        System.out.println("0. Sortir");
        System.out.print("Escull una opció: ");
    }
    /* 1. Opcional pedir datos de entrada */
    private void afegirProducte(RepositoriProductesDAO repositori) {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nom: ");
            String nom = scanner.nextLine();

            System.out.print("Preu: ");
            double preu = scanner.nextDouble();

            Producte p = new Producte(id, nom, preu);
            /* 2. Pasar datos al DAO */
            if (repositori.afegirProducte(p)) {
                System.out.println("Producto añadido correctamente");
            }
            else {
                System.out.println("No s eha añadaido" + p);
            }
            /* 3.Mostrar datos salida o consecuencia */
            System.out.println("Producte afegit correctament.");

        } catch (RepositoriPleException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void llistarProductes(RepositoriProductesDAO repositori) {
        System.out.println("\n--- LLISTA DE PRODUCTES ---");
        for (Producte p : repositori.obtenirTots()) {
            System.out.println(p);
        }
    }

    private void cercarProducte(RepositoriProductesDAO repositori) {
        try {
            /*Opcional datos de entrada para el repositorio */
            System.out.print("Introdueix ID a cercar: ");
            int id = scanner.nextInt();

            Producte trobat = repositori.cercarPerId(id);

            if (trobat != null) {
                System.out.println("Producte trobat:");
                System.out.println(trobat);
            } else {
                System.out.println("No existeix cap producte amb aquest ID.");
            }

        } catch (IdNegativaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void eliminarProducte(RepositoriProductesDAO repositori) {
        System.out.print("Introdueix ID a eliminar: ");
        int id = scanner.nextInt();

        if (repositori.eliminarProducte(id)) {
            System.out.println("Producte eliminat.");
        } else {
            System.out.println("No s'ha trobat el producte.");
        }
    }
}