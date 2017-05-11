package com.culturalcase.upb.culturalcasebogota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import centrosculturales.Singleton;

public class MainActivity extends AppCompatActivity {
    Button btnVamos;
    Singleton texto= new Singleton();
    EditText txtLocalidad;
    private String ubicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLocalidad=(EditText) findViewById(R.id.txtLocalidad);
        ubicacion=txtLocalidad.getText().toString().toLowerCase();
        texto.setLocalizacion(ubicacion);
        btnVamos=(Button) findViewById(R.id.btnVamos);
        btnVamos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Listado.class));

            }
        });

    }
}
