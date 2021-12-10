package com.practicasmmgg.appejerciciosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button saludo;
    Button calculadora;
    Button agenda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        agenda = (Button) findViewById(R.id.btnAgenda);
        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agenda = new Intent(MenuActivity.this, AgendaActivity.class);
                startActivity(agenda);
            }
        });
        saludo = (Button) findViewById(R.id.btnSaludo);
        saludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent saludo = new Intent(MenuActivity.this, SaludoActivity.class);
                startActivity(saludo);
            }
        });
        calculadora= (Button)  findViewById(R.id.btnCalculadora);
        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculadora = new Intent(MenuActivity.this, CalculadoraActivity.class);
                startActivity(calculadora);
            }
        });
    }
}