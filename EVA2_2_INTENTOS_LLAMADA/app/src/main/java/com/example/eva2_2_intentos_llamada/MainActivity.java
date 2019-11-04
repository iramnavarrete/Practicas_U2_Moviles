package com.example.eva2_2_intentos_llamada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edTxtTel;
    Intent marcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTxtTel = findViewById(R.id.editTextTelefono);
    }
    public void click(View v){
        View btn = findViewById(R.id.button);
        String sTel = "tel:" + edTxtTel.getText().toString();

        if(v == btn){
            marcar = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));
        }else{
            marcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        }

        startActivity(marcar);
    }

}
