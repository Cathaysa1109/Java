import Objetos.Botella;

public class TeoríaPOO {
    public static void main(String[] args) throws Exception {
        
    Botella bottle;
    bottle = new Botella();
    System.out.println("Capacidad botella: " + bottle.getCapacidad());
    System.out.println("ml líquido: " + bottle.getMlLiquido());
    System.out.println("Material: " + bottle.getMaterial());
    System.out.println("Tapon: " + bottle.estaCerrada());

    bottle.setLiquido(70);
    
}

}
