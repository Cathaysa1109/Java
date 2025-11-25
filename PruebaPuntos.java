package PruebaPuntos;
import Objetos.*;
public class PruebaPuntos {
    public static void main(String[] args) throws Exception {
        
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        System.out.println("P1 -> " + p1.getX() + " - " + p1.getY());
        System.out.println("P2 -> " + p2.getX() + " - " + p2.getY());
        System.out.println("P3 -> " + p3.getX() + " - " + p3.getY());

        //System.out.println("P1 -> " + p1.x + " - " + p1.y);
        //System.out.println("P2 -> " + p2.x + " - " + p2.y);
        //System.out.println("P3 -> " + p3.x + " - " + p3.y);

        p1.imprime();
        p2.imprime();
        p3.imprime();

        p3.setXY(0, 0);

    }
}
