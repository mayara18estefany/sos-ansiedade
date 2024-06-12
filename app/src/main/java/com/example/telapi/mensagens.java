package com.example.telapi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mensagens extends AppCompatActivity {
    private ImageView imageVoltarFe;
    private ImageView imageEnviar;
    private ImageView imageEnviarFed;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagens);

        imageVoltarFe = findViewById(R.id.imageVoltarFe);
        imageEnviar = findViewById(R.id.imageEnviarFed);
        imageEnviarFed = findViewById(R.id.imageEnviarFed);

        imageVoltarFe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });
        imageEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });
        imageEnviarFed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        });
    }
}