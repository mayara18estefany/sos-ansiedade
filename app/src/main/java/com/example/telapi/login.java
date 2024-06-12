package com.example.telapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    private EditText editUsuarioLG, editSenhaLG;
    private Button bt_EntrarLG;
    private TextView textEsqueceuS, textNovoCD;
    private FirebaseAuth mAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        editUsuarioLG = findViewById(R.id.editUsuarioLG);
        editSenhaLG = findViewById(R.id.editSenhaLG);
        bt_EntrarLG = findViewById(R.id.bt_EntrarLG);
        textEsqueceuS = findViewById(R.id.textEsqueceuS);
        textNovoCD = findViewById(R.id.textNovoCD);

        bt_EntrarLG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editUsuarioLG.getText().toString();
                String senha = editSenhaLG.getText().toString();
                loginUsuario(email, senha);
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

    private void loginUsuario(String email, String senha) {
        mAuth.signInWithEmailAndPassword(email, senha)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(login.this, "Login Realizado com sucesso !", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(login.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(login.this, "Falha no Login: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
