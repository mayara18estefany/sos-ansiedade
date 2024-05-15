package com.example.telapi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private EditText editUsuarioLG, editSenhaLG;
    private Button bt_EntrarLG;
    private TextView textEsqueceuS, textNovoCD;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsuarioLG = findViewById(R.id.editUsuarioLG);
        editSenhaLG = findViewById(R.id.editSenhaLG);
        bt_EntrarLG = findViewById(R.id.bt_EntrarLG);
        textEsqueceuS = findViewById(R.id.textEsqueceuS);
        textNovoCD = findViewById(R.id.textNovoCD);

        bt_EntrarLG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        textNovoCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), cadastro.class);
                startActivity(intent);
            }
        });
    }

}