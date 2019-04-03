package br.com.ricardo.testroutines;

import org.junit.Assert;
import org.junit.Test;

import br.com.ricardo.testroutines.models.Pessoa;

public class PessoaTeste {

    @Test(expected = IllegalArgumentException.class)
    public void testPessoaNegativa(){

        Pessoa p = new Pessoa("Luzia", -2);
    }

    @Test
    public void testPessoaMenor16NaoPodeVotar() {

        Pessoa p = new Pessoa("Ricardo", 15);
        boolean resultado = p.podeVotar();
        Assert.assertFalse(resultado);

    }

    @Test
    public void testPessoaMaiorOuIgualA16PodeVotar(){

        Pessoa p = new Pessoa("Ravene", 31);
        boolean resultado = p.podeVotar();
        Assert.assertTrue(resultado);
    }
}
