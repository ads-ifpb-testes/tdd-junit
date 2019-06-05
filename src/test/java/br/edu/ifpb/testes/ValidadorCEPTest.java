package br.edu.ifpb.testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidadorCEPTest {

    private ValidadorCEP validadorCEP;

    @Before
    public void setUp() {
        validadorCEP = new ValidadorCEPPadrao();
        System.out.println("Instanciou validadorCEP");
    }

    @After
    public void tearDown() {
        System.out.println("Terminou o método de teste");
    }

    @Test
    public void testarCEPValido() throws CEPNuloException {
        Assert.assertTrue(validadorCEP.validar("58900-000"));
    }

    @Test
    public void testarCEPVazio() throws CEPNuloException {
        Assert.assertFalse(validadorCEP.validar("     -   "));
    }

    @Test
    public void testarCEPIncompleto() throws CEPNuloException {
        Assert.assertFalse(validadorCEP.validar("58900-00"));
    }

    @Test
    public void testarCEPInvalido() throws CEPNuloException {
        Assert.assertFalse(validadorCEP.validar("AAAAA-AAA"));
    }

    @Test
    public void testarCEPNumerosELetras() throws CEPNuloException {
        Assert.assertFalse(validadorCEP.validar("589AA-00"));
    }

    @Test(expected = CEPNuloException.class)
    public void testarCEPNulo() throws CEPNuloException {
        validadorCEP.validar(null);
    }
}
