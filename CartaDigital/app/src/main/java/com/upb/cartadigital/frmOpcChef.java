package com.upb.cartadigital;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class frmOpcChef extends AppCompatActivity {
    Button btnPedidos, btnActualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_opc_chef);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnPedidos=(Button) findViewById(R.id.btnPedidos);
        btnActualizar=(Button) findViewById(R.id.btnActualizar);

        btnPedidos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmOpcChef.this,frmPedidos.class));
            }
        });
        btnActualizar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmOpcChef.this,frmMenu.class));
            }
        });
    }

}
