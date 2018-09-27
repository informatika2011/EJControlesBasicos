package com.example.dm2.ejcontrolesbasicos;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class BotonesActivity extends AppCompatActivity {

    //private Button btnSimple;
    private TextView lblMensaje;

    private ToggleButton btnToggle;

    private FloatingActionButton fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);


        lblMensaje = (TextView) findViewById(R.id.lblMensaje);
      /*  btnSimple = (Button) findViewById(R.id.btnBotonSimple);
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lblMensaje.setText("Boton simple pulsado");
                lblMensaje.setText(R.string.btnSimple);
            }
        });
        */
        btnToggle = (ToggleButton)findViewById(R.id.BtnToggle);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnToggle.isChecked())
                    lblMensaje.setText("Boton Toggle a ON");
                else
                        lblMensaje.setText("Boton Toggle a OFF");
            }
        });


        fabButton = (FloatingActionButton) findViewById(R.id.fab);

        fabButton.setBackgroundTintList(getResources().getColorStateList(R.color.fab_color));

        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblMensaje.setText("Boton Flotante pulsado");
            }
        });

    }

    protected void botonPulsado (View v){
        lblMensaje.setText(R.string.btnSimple);
    }
}
