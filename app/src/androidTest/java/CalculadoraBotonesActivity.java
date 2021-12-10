import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.practicasmmgg.appejerciciosbasicos.MenuActivity;
import com.practicasmmgg.appejerciciosbasicos.R;

public class CalculadoraBotonesActivity extends AppCompatActivity {
    //Declaración de Variables
    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView txtResultado;
    private Button btnRegresar;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        txtNumero1 = (EditText) findViewById(R.id.txtNum1);
        txtNumero2 = (EditText) findViewById(R.id.txtNum2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnRegresar = (Button) findViewById(R.id.btnRegresar2);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(CalculadoraBotonesActivity.this, MenuActivity.class);
                startActivity(regresar);

            }
        });

    }

    public void sumar(View view){
        int num1;
        int num2;
        int res;
        num1= Integer.parseInt(txtNumero1.getText().toString());
        num2= Integer.parseInt(txtNumero2.getText().toString());
       res= num1+num2;
       txtResultado.setText(""+res);
    }

    public void restar(View view){
        int num1;
        int num2;
        int res;
        num1= Integer.parseInt(txtNumero1.getText().toString());
        num2= Integer.parseInt(txtNumero2.getText().toString());
        res= num1-num2;
        txtResultado.setText(""+res);
    }

    public void multiplicar(View view){
        int num1;
        int num2;
        int res;
        num1= Integer.parseInt(txtNumero1.getText().toString());
        num2= Integer.parseInt(txtNumero2.getText().toString());
        res= num1*num2;
        txtResultado.setText(""+res);
    }
}