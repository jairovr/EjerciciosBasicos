package com.practicasmmgg.appejerciciosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {
    private Spinner spAgenda;
    private Button btnRegistrar;
    private TextView txtActividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        spAgenda =  (Spinner) findViewById(R.id.spDias);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
        txtActividad = (TextView) findViewById(R.id.txtActividad);
    }

    public void Agenda (View view) {
        String seleccion = spAgenda.getSelectedItem().toString();
        if (seleccion.equals("Viernes")){
            txtActividad.setText("Ir a Cine");
        }
        else if (seleccion.equals("Sabado")){
            txtActividad.setText("Hacer Deporte");
        }
        else if (seleccion.equals("Domingo")){
            txtActividad.setText("Ir a misa");
        }
        else {
            txtActividad.setText("Algo fallo");
        }
    }
}