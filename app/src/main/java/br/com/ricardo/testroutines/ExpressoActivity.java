package br.com.ricardo.testroutines;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.ricardo.testroutines.models.Calculadora;

public class ExpressoActivity extends AppCompatActivity {

    private EditText editExpressoNum1;
    private EditText editExpressoNum2;
    private Button buttonExpressoCalcular;
    private TextView textExpressoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expresso);

        editExpressoNum1 = (EditText) findViewById(R.id.edit_expresso_num1);
        editExpressoNum2 = (EditText) findViewById(R.id.edit_expresso_num2);
        buttonExpressoCalcular = (Button) findViewById(R.id.button_expresso_calcular);
        textExpressoResultado = (TextView) findViewById(R.id.text_expresso_resultado);

        buttonExpressoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1 = Integer.parseInt(editExpressoNum1.getText().toString());
                int n2 = Integer.parseInt(editExpressoNum2.getText().toString());

                int resultado = Calculadora.soma(n1, n2);

                textExpressoResultado.setText(String.valueOf(resultado));

            }
        });

    }
}
