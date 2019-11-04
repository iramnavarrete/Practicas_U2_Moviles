package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView txtViewDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtViewDatos = findViewById(R.id.textViewDatos);
        Intent intent2 = getIntent();
        txtViewDatos.setText(intent2.getStringExtra("datos"));
    }

    public void cerrar(View v){
        finish();
    }
}
