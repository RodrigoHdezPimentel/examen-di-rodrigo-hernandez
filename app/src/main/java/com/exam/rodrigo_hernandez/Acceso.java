package com.exam.rodrigo_hernandez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);

        Button toRegistro = findViewById(R.id.registrar);
        toRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRegister = new Intent(Acceso.this, Registro.class);
                startActivity(toRegister);
            }
        });
        EditText nombre = findViewById(R.id.user);
        EditText pass = findViewById(R.id.password);
        Button toMain = findViewById(R.id.login);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombre.getText().toString().equals("") || pass.getText().toString().equals("")){
                    Toast.makeText(Acceso.this, "Campos vacios", Toast.LENGTH_SHORT).show();
                }else{
                    nombre.setText("");
                    pass.setText("");
                    Intent toMain = new Intent(Acceso.this, Main.class);
                    startActivity(toMain);
                }
            }
        });
    }
}