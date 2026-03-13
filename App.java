import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        Set<String> hechiceros = new HashSet<>(); // no admite duplicados
        hechiceros.add("Satoru");
        hechiceros.add("Suguru");
        hechiceros.add("Yuji");
        hechiceros.add("Megumi");
        hechiceros.add("Megumi");

        System.out.println(hechiceros);
        for (String hech : hechiceros) {
            System.out.println(hechiceros);
        }

        Set<String> maldiciones = new TreeSet<>();
        maldiciones.add("Ryomen");
        maldiciones.add("Kashimo");
        maldiciones.add("Kenjaku");
        maldiciones.add("Choso");
        maldiciones.add("Mahito");

        maldiciones.remove("Mahito");
        System.out.println(maldiciones);
        //métodos específicos que nos ofrece el Set
        // A U B 

        Set<String> PelisTerror = new TreeSet<>();
        PelisTerror.add("La Maldición de Rockford");
        PelisTerror.add("Flash");


        Set<String> PelisCienciaFiccion = new TreeSet<>();
        PelisCienciaFiccion.add("Matrix");
        PelisCienciaFiccion.add("Blade Runner");
        PelisCienciaFiccion.add("Flash");
        PelisCienciaFiccion.add("La remontada del city contra el madrid");

        Set<String> Fantasia = new TreeSet<>();
        Fantasia.add("Jujutsu Kaisen 0");

        // System.out.println("Pelis de terror y ciencia ficción");
        // PelisTerror.addAll(PelisCienciaFiccion);
        // PelisTerror.addAll(Fantasia);
        System.out.println(PelisTerror);
        //interesección
        // PelisTerror.retainAll(PelisCienciaFiccion);
        System.out.println("Pelis de ciencia ficción y terror");
        System.out.println(PelisTerror);
        //diferencia me muestra los objetos que están
        //en el primero y no en el segundo
        System.out.println("Pelis de terror epro que no son ciencia ficción");
        PelisTerror.removeAll(PelisCienciaFiccion);
        System.out.println(PelisTerror);
    }
}
