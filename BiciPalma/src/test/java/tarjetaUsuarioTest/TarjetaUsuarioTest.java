package tarjetaUsuarioTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import tarjetaUsuario.TarjetaUsuario;

public class TarjetaUsuarioTest {

    TarjetaUsuario tarjetaUsuarioTest = new TarjetaUsuario("000456789", true);

    @Before
    public void init() {

        TarjetaUsuario tarjetaUsuarioTest = new TarjetaUsuario("000456789", true);
        assertNotNull(tarjetaUsuarioTest);
    }

    @Test
    public void getIdTarjetaTest() {
        assertEquals("000456789", tarjetaUsuarioTest.getIdTarjeta());
    } 

    @Test
    public void getActivadaTest() {
        assertEquals(true, tarjetaUsuarioTest.getActivada());
    }
}