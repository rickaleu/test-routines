package br.com.ricardo.testroutines;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

//É preciso especificar que você está rodando o Roboletric usando a anotation @RunWith
@RunWith(RobolectricTestRunner.class)
public class RoboletricTeste {

    ExpressoActivity activity;


    //Usando esta anotation, você pode fazer testes antes mesmo de iniciar o teste principal
    @Before
    public void setUp() throws Exception {

        activity = Robolectric.buildActivity(ExpressoActivity.class).create().get();
        Assert.assertNotNull(activity);
    }

    //Teste principal
    @Test
    public void test(){
        Assert.assertNotNull(activity);
    }

}
