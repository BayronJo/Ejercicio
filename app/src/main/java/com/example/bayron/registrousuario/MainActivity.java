package com.example.bayron.registrousuario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnRegistrar;
    private String Nombres, Apellidos, Correo, Contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Nombres = ((EditText) findViewById(R.id.txtNombres)).getText().toString();
                Apellidos = ((EditText) findViewById(R.id.txtApellidos)).getText().toString();
                Correo = ((EditText) findViewById(R.id.txtCorreo)).getText().toString();
                Contraseña = ((EditText) findViewById(R.id.txtContraseña)).getText().toString();
                if(Validacion()){
                Intent segunda = new Intent(MainActivity.this, SegundaActivity.class);
                segunda.putExtra("Nombres", Nombres);
                segunda.putExtra("Apellidos", Apellidos);
                segunda.putExtra("Correo", Correo);
                segunda.putExtra("Contraseña", Contraseña);
                startActivity(segunda);
            }else
                {
                    Toast.makeText(getApplicationContext(),"No Deje Campos Vacios",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private Boolean Validacion() {
        Boolean valido = true;
        if (Nombres.isEmpty()) {
            valido = false;
        }
        if (Apellidos.isEmpty()) {
            valido = false;
        }
        if (Correo.isEmpty()) {
            valido = false;
        }
        if (Contraseña.isEmpty()) {
            valido = false;
        }
        return valido;
    }
}
