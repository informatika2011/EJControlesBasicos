package com.example.dm2.ejcontrolesbasicos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EjemploActivity extends AppCompatActivity {

    private TextView lblResultado;
    private EditText txtCuadroTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);


        lblResultado = (TextView)findViewById(R.id.LblResultado);
        txtCuadroTexto = (EditText)findViewById(R.id.TxtCuadroTexto);

    }
    public void Copiar (View v){
        //Escribimos la caberera "HAS ESCRITO EN EL CUADRO DE TEXTO:"
        // y el texto
        lblResultado.setText(this.getString(R.string.hasescrito) +
                txtCuadroTexto.getText().toString());
        Toast.makeText(getApplicationContext(), txtCuadroTexto.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }

}
