package com.example.bayron.registrousuario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        RecogerDatos();
    }

    private  void RecogerDatos()
    {
        Bundle Datos = getIntent().getExtras();
        String Nombres = Datos.getString("Nombres");
        String Apellidos = Datos.getString("Apellidos");
        String Correo = Datos.getString("Correo");
        String Contraseña = Datos.getString("Contraseña");

        TextView lblnombres = (TextView) findViewById(R.id.lblNombres);
        lblnombres.setText(Nombres);
        TextView lblApellidos = (TextView) findViewById(R.id.lblApellidos);
        lblApellidos.setText(Apellidos);
        TextView lblCorreo = (TextView) findViewById(R.id.lblCorreo);
        lblCorreo.setText(Correo);
        TextView lblContraseña = (TextView) findViewById(R.id.lblContraseña);
        lblContraseña.setText(Contraseña);
    }
}
