package Objetos;
import PruebaPuntos.PruebaPuntos;
public class Punto {

    private int x;
    private int y;

    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprime(){
        System.out.println("Punto: "  + this.x + ", " + this.y);
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public void resta(Punto p){
        this.x -= p.getX();
        this.y -= p.getY();
    }

}

