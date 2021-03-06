package estacion;

import org.apache.commons.lang3.ArrayUtils;

import bicicleta.Bicicleta;
import tarjetaUsuario.TarjetaUsuario;

public class Estacion {

    // Atributos

    private int idEstacion = 0;
    private String direccion = "";
    private int numeroAnclajes = 0;
    private Bicicleta[] anclajes;

    // Constructor

    public Estacion() {}

    public Estacion(int idEstacion, String direccion, int numeroAnclajes) {
        this.idEstacion = idEstacion;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[this.numeroAnclajes];
    }

    // Getters

    public int getIdEstacion() {
        return this.idEstacion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }

    // Lógica
    
    public void consultarEstacion() {
        System.out.println("\n"+ "Id Estación: " + getIdEstacion() + "\n" + 
                            "Dirección: " + getDireccion() + "\n" + 
                            "Anclaje: " + getNumeroAnclajes());
    }

    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Bicicleta anclaje : this.anclajes) {
            if (anclaje == null) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }

    public int generarAnclaje() {
        int anclajeRandom = (int) (Math.random() * (this.numeroAnclajes - 1)) + 1;
        return anclajeRandom;
    }

    public void anclarBicicleta(Bicicleta idBicicleta) {
        int anclajeRandom = generarAnclaje();
        while (this.anclajes[anclajeRandom] != null) {
            anclajeRandom =  generarAnclaje();
        }
        this.anclajes[anclajeRandom] = idBicicleta;
    }

    public void consultarAnclajes() {
        int posicion = 0;
        for (Bicicleta bicicleta : this.anclajes) {
            if (bicicleta == null) {
                System.out.println("\n" + "Anclaje " + posicion + ": libre");
            }
            else {
                System.out.println("\n" + "Anclaje " + posicion + ": " + bicicleta.getIdBicicleta());
            }
            posicion++;
        }
    }

    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
        return tarjetaUsuario.getActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {

        if (leerTarjetaUsuario(tarjetaUsuario)) {

            int anclajeGenerado = generarAnclaje();

            while (this.anclajes[anclajeGenerado] == null) {
                anclajeGenerado = generarAnclaje();
            }
            this.anclajes[anclajeGenerado] = null;
        }
        else { 
            System.out.println("No puede retirar bicicleta, la tarjeta no está activada.");
        }
    }
}