package bicicletaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import bicicleta.Bicicleta;

public class BicicletaTest {

    private Bicicleta bicicletaTest = new Bicicleta(9);

    @Before
    public void init() {
        Bicicleta bicicletaTest = new Bicicleta(9);
        assertNotNull(bicicletaTest);
    }

    @Test
    public void getIdBicicletaTest() {
        assertEquals(9, bicicletaTest.getIdBicicleta());
    }
}