package br.com.ricardo.testroutines;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.ricardo.testroutines.models.Pessoa;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTeste {

    ExpressoActivity activity;

    @Mock
    Pessoa model;


    //Usando esta anotation, você pode fazer testes antes mesmo de iniciar o teste principal
    @Before
    public void setUp() throws Exception {

        activity = new ExpressoActivity();
        Assert.assertNotNull(activity);
        Assert.assertTrue(true);

    }

    //Teste principal
    @Test
    public void test() throws Exception{
        Assert.assertTrue(true);
    }

}
