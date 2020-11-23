package com.example.navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundo extends AppCompatActivity {

    TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        String message = getIntent().getStringExtra(MainActivity.mensaje);

        saludo = (TextView)findViewById(R.id.txtSaludo);
        saludo.setText("Hola "+message);
    }
}