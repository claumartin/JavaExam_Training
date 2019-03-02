package estacion;

import bicicleta.Bicicleta;

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
        int anclajeRandom = (int) (Math.random() * this.numeroAnclajes) + 1;
        while (this.anclajes[anclajeRandom] != null) {
            anclajeRandom = (int) (Math.random() * this.numeroAnclajes) + 1;
        }
        return anclajeRandom;
    }
}