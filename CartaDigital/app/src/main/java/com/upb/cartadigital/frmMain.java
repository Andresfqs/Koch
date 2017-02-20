package com.upb.cartadigital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class frmMain extends AppCompatActivity {

    Button btnMesero,btnChef,btnCliente;
    ImageButton ibtnUbicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_main);

        btnMesero=(Button) findViewById(R.id.btnMesero);
        btnChef=(Button) findViewById(R.id.btnPedidos);
        btnCliente=(Button) findViewById(R.id.btnActualizar);
        ibtnUbicacion=(ImageButton) findViewById(R.id.ibtnUbicacion);

        btnMesero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMain.this,frmMenu.class));
            }
        });
        btnCliente.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMain.this,frmMenu.class));
            }
        });
        btnChef.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMain.this,frmOpcChef.class));
            }
        });
        ibtnUbicacion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(frmMain.this,Ubicacion.class));
            }
        });

    }
}
