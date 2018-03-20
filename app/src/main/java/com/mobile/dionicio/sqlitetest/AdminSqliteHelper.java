package com.mobile.dionicio.sqlitetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dionicio on 19/03/18.
 */

public class AdminSqliteHelper extends SQLiteOpenHelper {

    private static final String CREATE_TABLA_PRODUCTOS
            = "CREATE TABLE PRODUCTOS(CODIGO INT PRIMARY KEY AUTOINCREMENT, DESCRIPCION TEXT, PRECIO DOUBLE, EXISTENCIA DOUBLE)";

    private static final String DROP_TABLA_PRODUCTOS
            = "DROP TABLE IF EXISTS PRODUCTOS";

    public AdminSqliteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLA_PRODUCTOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLA_PRODUCTOS);
    }
    
}
