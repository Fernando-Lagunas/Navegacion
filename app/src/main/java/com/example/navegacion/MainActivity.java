package com.example.navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button saludar;
    EditText nombre;
    public static final String mensaje = "com.example.navegacion.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent activity2 = new Intent(this, segundo.class);

        saludar = (Button)findViewById(R.id.btnSaludar);
        nombre = (EditText)findViewById(R.id.ptxtNombre);

        nombre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nombre.setHint("");
            }
        });

        saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = nombre.getText().toString();
                if (message.isEmpty()) mostrarToastShort("DIGITE UN NOMBRE");
                activity2.putExtra(mensaje, message);
                startActivity(activity2);
            }
        });
        }

        private void mostrarToastShort(String mensajeToast){
                Toast nsg = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
                nsg.show();
        }

    }


