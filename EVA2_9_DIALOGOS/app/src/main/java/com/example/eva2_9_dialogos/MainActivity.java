package com.example.eva2_9_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEstandar(View v){
        new AlertDialog.Builder(this)
        .setTitle("Hola")
        .setMessage("asndiasd")
        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Toast.makeText(getApplicationContext(),"Hola soy un toast positivo",Toast.LENGTH_SHORT).show();

        }
        })
        .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Hola soy un toast negativo",Toast.LENGTH_SHORT).show();

            }
        })
        .setNeutralButton("neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Hola soy un toast neutral",Toast.LENGTH_SHORT).show();

            }
        }).create().show();

        }

    public void clickPropio(View v){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);

            //Vincular los widgets
        final EditText edtTxtCaptu = dialog.findViewById(R.id.edtTxtNombre);
        Button btnOK = dialog.findViewById(R.id.buttonOk);

        btnOK.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        String sCade = edtTxtCaptu.getText().toString();
                        Toast.makeText(getApplicationContext(),sCade,Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
        dialog.show();
    }
}
