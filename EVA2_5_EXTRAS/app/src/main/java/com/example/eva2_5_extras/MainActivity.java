package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextDatos;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextDatos = findViewById(R.id.editTextDatos);

        intent = new Intent(this,Secundaria.class);
    }
    public void enviarDatos(View v){
        String sMensa = editTextDatos.getText().toString();
        intent.putExtra("datos",sMensa);
        startActivity(intent);
    }
}
