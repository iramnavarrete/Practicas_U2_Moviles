package com.example.eva2_7_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int SECUNDARIA = 1000;
    TextView txtViewDatos;
    Intent inLanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewDatos = findViewById(R.id.txtViewDatos);
        inLanzar = new Intent (this,Secundaria.class);
    }

    public void clickLanzar(View v){
        startActivityForResult(inLanzar,SECUNDARIA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case SECUNDARIA:
                //Algo con los datos
                if (resultCode == Activity.RESULT_OK){
                    //Aquí recibimos datos
                    txtViewDatos.setText(data.getStringExtra("MENSAJE"));
                }
                break;
            default:

        }
    }
}
