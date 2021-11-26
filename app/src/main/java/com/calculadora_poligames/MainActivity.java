package com.calculadora_poligames;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button buttonSuma,buttonResta,buttonMultiplica,buttonDivide,buttonLbGm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSuma = findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSuma();
            }
        });
        buttonResta = findViewById(R.id.buttonResta);
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirResta();
            }
        });
        buttonMultiplica= findViewById(R.id.buttonMultiplicacion);
        buttonMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMultiplicacion();
            }
        });

        buttonDivide = findViewById(R.id.buttonDividir);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { abrirDivision(); }
        });
        buttonLbGm = findViewById(R.id.buttonLbGm);
        buttonLbGm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { abrirLbGm(); }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    private void abrirSuma(){
        Intent intent = new Intent(this, SumaActivity.class);
        startActivity( intent );
    }
    private void abrirResta(){
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity( intent );
    }
    private void abrirMultiplicacion(){
        Intent intent = new Intent(this, MultiplicacionActivity.class);
        startActivity( intent );
    }
    private void abrirDivision(){
        Intent intent = new Intent(this, DivisionActivity.class);
        startActivity( intent );
    }
    private void abrirLbGm(){
        Intent intent = new Intent(this, LibrasGramosActivity.class);
        startActivity( intent );
    }

}