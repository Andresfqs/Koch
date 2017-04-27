package com.culturalcase.upb.culturalcasebogota;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import centrosculturales.*;
import com.google.gson.*;
import java.util.ArrayList;

public class Listado extends AppCompatActivity {
    private ListView listaa;
    Button btnListar;
    static ArrayList<GsonCentroCultural> lista;
    AppCompatActivity a;
    Context contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        a=this;
        ;
        contexto= getApplicationContext();
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        Tabla tabla = gson.fromJson(ArchivoJson.enviarJson(), Tabla.class);
        lista= new ArrayList<GsonCentroCultural>();
        listaa=(ListView) findViewById(R.id.listView);


    }
}
