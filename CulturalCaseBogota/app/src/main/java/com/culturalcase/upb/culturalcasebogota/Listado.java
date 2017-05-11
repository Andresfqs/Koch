package com.culturalcase.upb.culturalcasebogota;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import centrosculturales.*;
import com.google.gson.*;
import java.util.ArrayList;


public class Listado extends AppCompatActivity {

    private ListView listaa;
    private Button btnListar;
    private TextView lblUbicacion;
    private Singleton texto=new Singleton();
    private static ArrayList<GsonCentroCultural> lista;
    private AppCompatActivity a;
    private Context contexto;
    private Tabla tabla= new Tabla();
    private GsonCentroCultural centro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        lblUbicacion=(TextView) findViewById(R.id.lblLocalidad);
        lblUbicacion.setText(texto.getLocalizacion());
        a=this;
        listaa=(ListView) findViewById(R.id.listCentros);
        contexto= getApplicationContext();
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        lista= new ArrayList<GsonCentroCultural>();
        //tabla = gson.fromJson(ArchivoJson.enviarJson(), Tabla.class);
    }

}
