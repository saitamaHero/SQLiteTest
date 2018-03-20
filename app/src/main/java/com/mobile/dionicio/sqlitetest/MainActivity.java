package com.mobile.dionicio.sqlitetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showWelcomeMessage();
    }

    private void showWelcomeMessage(){
        Toast.makeText(getApplicationContext(),"Bienvenido a TestSqlite!",Toast.LENGTH_SHORT).show();
    }
}
