package tarjetaUsuario;

public class TarjetaUsuario {

    // Atributos

    private String idTarjeta = "";
    private boolean activada = true;

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

    public boolean getActivada() {
        return this.activada;
    }
}