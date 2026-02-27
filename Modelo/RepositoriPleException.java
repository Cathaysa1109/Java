package Modelo;
public class RepositoriPleException extends Exception {

    public RepositoriPleException() {
        super("El repositori està ple.");
    }

    public RepositoriPleException(String missatge) {
        super(missatge);
    }
}
