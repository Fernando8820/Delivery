package com.cimaadelivery.session;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cimaadelivery.proj.R;

public class InicioSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }
    public void aceptar(View view) {
        Intent rent = new Intent(InicioSesion.this,InicioSesion2.class);
        startActivity(rent);
    }


}
