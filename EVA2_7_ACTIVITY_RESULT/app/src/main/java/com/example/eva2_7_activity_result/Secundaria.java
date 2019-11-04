package com.example.eva2_7_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Secundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
    }

    public void clickEnviar(View v){

        Intent inDatos = new Intent();
        if (v.getId() == R.id.button2){
            setResult(Activity.RESULT_CANCELED, inDatos);
            finish();
        }
        else{

            inDatos.putExtra("MENSAJE","HOLA MUNDO CRUEL");
            setResult(Activity.RESULT_OK, inDatos);
            finish();
        }
    }
}
