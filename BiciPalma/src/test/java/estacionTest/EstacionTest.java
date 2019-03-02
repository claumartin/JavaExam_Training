package estacionTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
}