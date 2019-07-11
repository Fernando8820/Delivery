package com.cimaadelivery;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;


public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    final String CREAR_TABLA_CONSULTA="CREATE TABLE consulta (String nameServ, String nameBD, InputStream log)";


    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_CONSULTA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAntigua, int versionNueva) {
        db.execSQL("DROP TABLE IF EXIST consulta");
        onCreate(db);
    }
}
