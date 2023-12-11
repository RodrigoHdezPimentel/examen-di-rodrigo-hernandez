package com.exam.rodrigo_hernandez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        EditText nombre = findViewById(R.id.nombre);
        EditText mail = findViewById(R.id.mail);
        EditText pass = findViewById(R.id.pass);
        EditText confpass = findViewById(R.id.confpass);

        Button toAcceso = findViewById(R.id.volver);
        toAcceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toAcceso = new Intent(Registro.this, Acceso.class);
                startActivity(toAcceso);
            }
        });
        Button registrar = findViewById(R.id.confRegist);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombre.getText().toString().equals("")||mail.getText().toString().equals("savedInstanceState.isEmpty()")
                        ||pass.getText().toString().equals("savedInstanceState.isEmpty()")||confpass.getText().toString().equals("")){
                    Toast.makeText(Registro.this, "Campos vacios", Toast.LENGTH_LONG).show();
                }else{
                    if(pass.getText().toString().equals(confpass.getText().toString())){
                        Toast.makeText(Registro.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                        Intent toMain = new Intent(Registro.this, Main.class);
                        startActivity(toMain);
                    }else{
                        Toast.makeText(Registro.this, "Error de validacion", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}