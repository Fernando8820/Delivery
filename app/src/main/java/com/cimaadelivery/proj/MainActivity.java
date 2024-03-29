package com.cimaadelivery.proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cimaadelivery.ConexionSQLiteHelper;
import com.cimaadelivery.session.InicioSesion;

public class MainActivity extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1_inicio);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, InicioSesion.class));
            }
        });

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd consulta", null, 1);
    }
}
