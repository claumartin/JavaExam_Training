package tarjetaUsuario;

public class TarjetaUsuario {

    // Atributos

    private String idTarjeta = "";
    private boolean activada;

    // Constructores

    public TarjetaUsuario() {}

    public TarjetaUsuario(String idTarjeta, boolean activada) {
        this.idTarjeta = idTarjeta;
        this.activada = activada;
    }

    // Getters

    public String getIdTarjeta() {
        return this.idTarjeta;
    }
}