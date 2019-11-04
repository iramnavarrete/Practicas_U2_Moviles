package com.example.eva2_3_mensaje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTxtTel, getEditTxtMensa;
    Intent inSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtTel = findViewById(R.id.editTxtTel);
        getEditTxtMensa = findViewById(R.id.editTxtMensa);

    }
    public void onClick(View v){
        String sTel = "smsto:" + editTxtTel.getText().toString();
        inSMS = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        inSMS.putExtra("sms_body", getEditTxtMensa.getText().toString());
        startActivity(inSMS);
    }

}
