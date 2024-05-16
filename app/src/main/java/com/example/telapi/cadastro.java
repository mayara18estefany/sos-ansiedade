package com.example.telapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class cadastro extends AppCompatActivity {
    FirebaseAuth autenticacao;
    Usuario usuario;
    private EditText editNome, editData, editSenha, editUsuario,editEmail;
    private Button bt_cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        inicializar();


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
    private void validarcampos(){
        String Editnome = editNome.getText().toString();
        String senha = editSenha.getText().toString();
        String data = editData.getText().toString();
        String usuario = editUsuario.getText().toString();
        String email = editEmail.getText().toString();

        if (!Editnome.isEmpty()){
            if(!email.isEmpty()){
                if (!senha.isEmpty()){

                    Usuario Usuario = new Usuario();
                    usuario.setNome(editNome.getText().toString());
                    //Cadastro
                    cadastrarUsuario();

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

    private void cadastrarUsuario() {




}