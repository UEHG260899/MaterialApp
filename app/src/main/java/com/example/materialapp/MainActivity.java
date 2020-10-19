package com.example.materialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText etNom = findViewById(R.id.etNombre);
        TextInputEditText etPass = findViewById(R.id.etPass);
        Button btnIng = findViewById(R.id.btnIngresar);

        btnIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etNom.getText().toString();
                String cont = etPass.getText().toString();

                if(usuario.equals("Uriel") && cont.equals("Hernandez")){
                    Intent intent = new Intent(v.getContext(), ActivityCards.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Error, el usuario no esta registrado", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}