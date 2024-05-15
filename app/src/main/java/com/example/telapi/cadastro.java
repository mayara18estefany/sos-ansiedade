package com.example.telapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cadastro extends AppCompatActivity {
    private EditText editNome, editData, editSenha, editUsuario,editEmail;
    private Button bt_cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editNome = findViewById(R.id.editNome);
        editData = findViewById(R.id.editData);
        editSenha = findViewById(R.id.editSenha);
        editUsuario = findViewById(R.id.editUsuario);
        editEmail = findViewById(R.id.editEmail);
        bt_cd = findViewById(R.id.bt_cd);

        bt_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (getApplicationContext(), login.class);
                startActivity(intent);
            }
        });
    }
}