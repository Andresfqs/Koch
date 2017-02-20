package com.upb.cartadigital;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class frmMenu extends AppCompatActivity {

    Button btnEntradas,btnPlatoFuerte,btnPostres,btnBebidas,btnMenuInfantil,btnRecomendasionDelDia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnEntradas=(Button) findViewById(R.id.btnEntradas);
        btnPlatoFuerte=(Button) findViewById(R.id.btnPlatoFuerte);
        btnPostres=(Button) findViewById(R.id.btnPostre);
        btnBebidas=(Button) findViewById(R.id.btnBebidas);
        btnMenuInfantil=(Button) findViewById(R.id.btnMenuInfantia);
        btnRecomendasionDelDia=(Button) findViewById(R.id.btnRecomendacion);


        btnEntradas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMenu.this,frmEntradas.class));
            }
        });
        btnPlatoFuerte.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMenu.this,frmEntradas.class));
            }
        });
        btnPostres.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMenu.this,frmEntradas.class));
            }
        });
        btnBebidas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMenu.this,frmEntradas.class));
            }
        });
        btnMenuInfantil.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMenu.this,frmEntradas.class));
            }
        });
        btnRecomendasionDelDia.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMenu.this,frmEntradas.class));
            }
        });

    }

}
