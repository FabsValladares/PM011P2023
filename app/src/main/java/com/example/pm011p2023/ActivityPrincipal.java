package com.example.pm011p2023;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityPrincipal extends AppCompatActivity {

    Button btnagregar, btnlista,btncombo;
    ImageButton imageButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnagregar = (Button) findViewById(R.id.btn_ingresar);
        btnlista = (Button) findViewById(R.id.btn_lista);
        btncombo = (Button) findViewById(R.id.btn_combo);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //codigo llamar un activity
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //codigo llamar un activity
                Intent intent = new Intent(getApplicationContext(), ActivityListView.class);
                startActivity(intent);
            }
        });

        btncombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //codigo llamar un activity
                Intent intent = new Intent(getApplicationContext(), ActivityCombo.class);
                startActivity(intent);
            }
        });
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //codigo llamar un activity
                    Intent intent = new Intent(getApplicationContext(), ActivityPhoto.class);
                    startActivity(intent);
                }
        });
    }
}