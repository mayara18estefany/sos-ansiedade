package com.example.telapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class caminhar extends AppCompatActivity {
    private ImageView imageAvanC;
    private ImageView imageVoltarE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caminhar);

        imageAvanC = findViewById(R.id.imageAvanC);
        imageVoltarE = findViewById(R.id.imageVoltarE);

        imageAvanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),dancar.class);

                startActivity(intent);
            }
        });
        imageVoltarE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),exercicio.class);

                startActivity(intent);
            }
        });
    }
}