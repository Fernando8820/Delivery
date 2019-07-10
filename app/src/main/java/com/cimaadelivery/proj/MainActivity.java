package com.cimaadelivery.proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cimaadelivery.ConexionSQLiteHelper;
import com.cimaadelivery.session.InicioSesion;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd consulta", null, 1);
    }

    public void iniciars(View view) {
        Intent init = new Intent(MainActivity.this, InicioSesion.class);
        startActivity(init);
    }

}
