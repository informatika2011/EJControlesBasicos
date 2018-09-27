package com.example.dm2.ejcontrolesbasicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnBoton;
    private Button btnImagenes;
    private Button btnCtrlSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBoton = (Button) findViewById(R.id.btnEjBotones);

        btnBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent (MainActivity.this, BotonesActivity.class);
                startActivity(intento);
            }
        });

        btnImagenes = (Button)findViewById(R.id.btnEjImagenes);
        btnImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent (MainActivity.this, ImagenesActivity.class);
                startActivity(intento);
            }
        });

        btnCtrlSeleccion = (Button)findViewById(R.id.btnCtrlSeleccion);
        btnCtrlSeleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent (MainActivity.this, CtrolSeleccionActivity.class);
                startActivity(intento);
            }
        });


    }
    protected void ejemplo (View v){
        Intent intento = new Intent (MainActivity.this, EjemploActivity.class);
        startActivity(intento);
    }

}
