package br.com.ricardo.testroutines;

import junit.framework.TestCase;

import br.com.ricardo.testroutines.models.Pessoa;

public class PessoaTeste extends TestCase {

    public void testPessoaComIdadeMenorQue16NaoPodeVotar() {

        Pessoa p = new Pessoa("Ricardo", -2);
        boolean resultado = p.podeVotar();
        assertFalse("Teste executado", resultado);

    }

    public void testPessoaComIdadeMaiorOuIgualA16PodeVotar(){

        Pessoa p = new Pessoa("Ravene", 31);
        boolean resultado = p.podeVotar();
        assertTrue("Teste executado", resultado);
    }
}
