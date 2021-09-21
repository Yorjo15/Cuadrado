package com.example.cuadrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt_numero = null;
    private TextView txtresultado = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero = (EditText) findViewById(R.id.edt_numero);
        txtresultado = (TextView) findViewById(R.id.txt_resultadocuadrado);
    }

    public void calcularCuadrado(View v) {
        //Button boton = (Button) v;
        //boton.setText("cambio el texto");
        String textonumero = String.valueOf(edt_numero.getText());
        double numero = Double.valueOf(textonumero);
        double resultado = numero * numero;
        txtresultado.setText(String.valueOf(resultado));
        Toast.makeText(this, "el cuadrado vale " + String.valueOf(resultado), Toast.LENGTH_LONG).show();
    }
}