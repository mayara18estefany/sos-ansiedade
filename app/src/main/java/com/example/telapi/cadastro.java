package com.example.telapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;


public class cadastro extends AppCompatActivity {

    Usuario usuario;
    private EditText editNome, editData, editSenha, editUsuario,editEmail;
    private Button bt_cd;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        inicializar();

        mAuth = FirebaseAuth.getInstance();


        bt_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent (getApplicationContext(), login.class);
                startActivity(intent);
            }
        });
    }
    private void inicializar(){
        editNome = findViewById(R.id.editNome);
        editData = findViewById(R.id.editData);
        editSenha = findViewById(R.id.editSenha);
        editUsuario = findViewById(R.id.editUsuario);
        editEmail = findViewById(R.id.editEmail);
        bt_cd = findViewById(R.id.bt_cd);
    }
    private void validarcampos(View view){
        String Editnome = editNome.getText().toString();
        String senha = editSenha.getText().toString();
        String data = editData.getText().toString();
        String usuario = editUsuario.getText().toString();
        String email = editEmail.getText().toString();

        if (!Editnome.isEmpty()){
            if(!email.isEmpty()){
                if (!senha.isEmpty()){

                    Usuario Usuario = new Usuario();
                    Usuario.setNome(editNome.getText().toString());
                    Usuario.setEmail(editEmail.getText().toString());
                    Usuario.setUsuario(editUsuario.getText().toString());
                    Usuario.setSenha(editSenha.getText().toString());
                    Usuario.setDatadenascimento(editData.getText().toString());


                    cadastrarUsuario(email, senha);

                }else{
                    Toast.makeText(this, "Preencha a senha", Toast.LENGTH_SHORT).show();
                }

            }else{
                Toast.makeText(this, "Preencha o email", Toast.LENGTH_SHORT).show();
            }
        }else{
        Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show();
    }

        }

    private void cadastrarUsuario(String email, String senha) {
    }

    private void cadastrarUsuario(final String nome, String email, String senha) {
        mAuth.createUserWithEmailAndPassword(email, senha)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Usuario usuario = new Usuario();
                            usuario.setNome(nome);
                            usuario.setEmail(email);
                            usuario.setSenha(senha);

                            Toast.makeText(cadastro.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(cadastro.this, "Falha no cadastro: " + Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}