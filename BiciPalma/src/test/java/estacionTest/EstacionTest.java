package estacionTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bicicleta.Bicicleta;
import estacion.Estacion;

public class EstacionTest {

    private Estacion estacionTest = new Estacion(1, "Manacor", 6);

    @Before
    public void init() {
        Estacion estacionTest = new Estacion(1, "Manacor", 6);
        assertNotNull(estacionTest);
    }

    @Test
    public void getIdEstacionTest() {
        assertEquals(1, estacionTest.getIdEstacion());
    }

    @Test
    public void getDireccionTest() {
        assertEquals("Manacor", estacionTest.getDireccion());
    }

    @Test
    public void getAnclajesTest() {
        assertEquals(6, estacionTest.getNumeroAnclajes());
    }

    @Test
    public void anclajesLibresTest() {
        assertEquals(6, estacionTest.anclajesLibres());
    }

    @Test
    public void generarAnclajeTest() {

        int posicionAnclaje = estacionTest.generarAnclaje();
        assertTrue(6 > posicionAnclaje);
    }

    @Test
    public void cosultarAnclajesTest() {

        int[] bicicletas = {291, 292, 293, 294};

        for ( int id: bicicletas ){
			Bicicleta bicicleta = new Bicicleta(id);
			estacionTest.anclarBicicleta(bicicleta);
        }
        
        assertEquals(2, estacionTest.anclajesLibres());
    }
}