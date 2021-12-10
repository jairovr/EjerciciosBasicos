package com.practicasmmgg.appejerciciosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {
  //Declaracion de Variables
    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView txtResultado;
    private Button btnOperacion;
    private Spinner spOperaciones;
    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        txtNumero1 = (EditText) findViewById(R.id.txtNum1);
        txtNumero2 = (EditText) findViewById(R.id.txtNum2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        spOperaciones = (Spinner) findViewById(R.id.cboOperaciones);
        btnOperacion = (Button) findViewById(R.id.btnCalcular);

        regresar = (Button) findViewById(R.id.btnRegresar2);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(CalculadoraActivity.this, MenuActivity.class);
                startActivity(regresar);

            }
        });

    }

    public void calcular(View view) {
        int num1;
        int num2;
        int res;
        num1 = Integer.parseInt(txtNumero1.getText().toString());
        num2 = Integer.parseInt(txtNumero2.getText().toString());
        String seleccion = spOperaciones.getSelectedItem().toString();
        if (seleccion.equals("Sumar")) {
            res = num1 + num2;
            txtResultado.setText("" + res);
        } else if (seleccion.equals("Restar")) {
            res = num1 - num2;
            txtResultado.setText("" + res);
        } else {
            res = num1 * num2;
            txtResultado.setText("" + res);
        }

    }

}