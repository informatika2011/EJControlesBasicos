package com.example.dm2.ejcontrolesbasicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CtrolSeleccionActivity extends AppCompatActivity {

    private CheckBox cbMarcame;
    private TextView lblMensajeCheckBox;

    private TextView lblMensaje;
    private RadioButton rbOpcion1, rbOpcion2, rbOpcion3;

    private RadioGroup rgOpciones;

    private Button btnAcercaDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctrol_seleccion);

      cbMarcame = (CheckBox) findViewById(R.id.chkMarcame);
      lblMensajeCheckBox = (TextView) findViewById(R.id.lblMensajeCheckBox);


/*
      cbMarcame.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              boolean isChecked = ((CheckBox)v).isChecked();

              if (isChecked)
                  lblMensajeCheckBox.setText("CheckBox Marcado");
              else
                  lblMensajeCheckBox.setText("CheckBox Descmarcado");

          }
      });
*/
      /* Con la opcion de onCheckedChange para el checkBox */

        cbMarcame.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    lblMensajeCheckBox.setText("Checkbox marcado!");
                }
                else {
                    lblMensajeCheckBox.setText("Checkbox desmarcado!");
                }
            }
        });

        rbOpcion1 = (RadioButton)findViewById(R.id.rbOpcion1);
        rbOpcion2 = (RadioButton)findViewById(R.id.rbOpcion2);
        rbOpcion3 = (RadioButton)findViewById(R.id.rbOpcion3);

        lblMensaje = (TextView)findViewById(R.id.lblSeleccion);
/*
        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String opcion ="";

                switch (v.getId()){
                    case R.id.rbOpcion1:
                        opcion ="Opcion 1";
                        break;

                    case R.id.rbOpcion2:
                        opcion ="Opcion 2";
                        break;

                    case R.id.rbOpcion3:
                        opcion ="Opcion 3";
                        break;
                }
                //lblMensaje.setText(R.string.mensaje);
                //lblMensaje.setText(lblMensaje.getText()+ " "+opcion);
                Toast.makeText(getApplicationContext(), opcion, Toast.LENGTH_SHORT).show();
                lblMensaje.setText("ID Opcion seleccionada: "+ opcion);

            }
        };
        rbOpcion1.setOnClickListener(list);
        rbOpcion2.setOnClickListener(list);
        rbOpcion3.setOnClickListener(list);
*/
        /* Con la opcion de onCheckedChange para los RadioButton */

        rgOpciones = (RadioGroup) findViewById(R.id.rgOpciones) ;
        rgOpciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String opcion = "";
                switch(checkedId) {
                    case R.id.rbOpcion1:
                        opcion = "opción 1";
                        break;
                    case R.id.rbOpcion2:
                        opcion = "opción 2";
                        break;
                    case R.id.rbOpcion3:
                        opcion = "opción 3";
                        break;
                }

                lblMensaje.setText("ID opción seleccionada: " + opcion);
            }
        });

        btnAcercaDe = (Button) findViewById(R.id.btnAcercaDe);
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(CtrolSeleccionActivity.this, AcercaDeActivity.class);
                startActivity(intento);
            }
        });


    }
    protected void reset(View v){
        rgOpciones.clearCheck();
    }


}
