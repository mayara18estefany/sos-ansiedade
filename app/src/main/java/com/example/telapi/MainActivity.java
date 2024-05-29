package com.example.telapi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity {
    private ImageView imageServe;
    private ImageView imageMM;
    private ImageView imageSos;
    private  ImageView imageSa;
    private ImageView imageExe;
    private ImageView imageFeed;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageServe= findViewById(R.id.imageServe);
        imageMM = findViewById(R.id.imageMM);
        imageSos = findViewById(R.id.imageSos);
        imageSa = findViewById(R.id.imageSa);
        imageExe = findViewById(R.id.imageExe);
        imageFeed = findViewById(R.id.imageFeed);



        imageServe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), sobreapp.class);

                startActivity(intent);
            }
        });

        imageMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), resul.class);

                startActivity(intent);
            }
        });

        imageSos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), contatos.class);

                startActivity(intent);
            }
        });

        imageSa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sobre.class);

                startActivity(intent);
            }
        });

        imageExe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), exercicio.class);

                startActivity(intent);
            }
        });

        imageFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mensagens.class);

                startActivity(intent);
            }
        });



    }
}