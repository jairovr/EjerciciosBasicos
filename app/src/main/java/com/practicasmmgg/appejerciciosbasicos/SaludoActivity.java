package com.practicasmmgg.appejerciciosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaludoActivity extends AppCompatActivity {

    Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        regresar= (Button) findViewById(R.id.btnRegresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(SaludoActivity.this, MenuActivity.class);
                startActivity(regresar);
            }
        });
    }
}