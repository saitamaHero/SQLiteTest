package com.mobile.dionicio.sqlitetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String DB_NAME = "productos.db";
    private static final int DB_VERSION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showWelcomeMessage();
    }

    private void showWelcomeMessage(){
        Toast.makeText(getApplicationContext(),"Bienvenido a TestSqlite!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        //Nothing for now
    }
}
