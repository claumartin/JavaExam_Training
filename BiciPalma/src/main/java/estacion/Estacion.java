package estacion;

public class Estacion {

    // Atributos

    int idEstacion = 0;
    String direccion = "";
    int anclajes = 0;

    // Constructor

    public Estacion() {}

    public Estacion(int idEstacion, String direccion, int anclajes) {
        this.idEstacion = idEstacion;
        this.direccion = direccion;
        this.anclajes = anclajes;
    }

    // Getters

    public int getIdEstacion() {
        return this.idEstacion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getAnclajes() {
        return this.anclajes;
    }

    // Lógica
    public void consultarEstacion() {
        System.out.println("\n"+ "Id Estación: " + getIdEstacion() + "\n" + 
                            "Dirección: " + getDireccion() + "\n" + 
                            "Anclaje: " + getAnclajes());
    }

}