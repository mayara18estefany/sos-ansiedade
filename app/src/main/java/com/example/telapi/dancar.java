package com.example.telapi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dancar extends AppCompatActivity {
    private ImageView imageVoltar;
    private ImageView imageVoltarH;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dancar);

        imageVoltar = findViewById(R.id.imageVoltar);
        imageVoltarH = findViewById(R.id.imageVoltarH);

        imageVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),caminhar.class);

                startActivity(intent);
            }
        });
        imageVoltarH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
            }
        });




    }
}