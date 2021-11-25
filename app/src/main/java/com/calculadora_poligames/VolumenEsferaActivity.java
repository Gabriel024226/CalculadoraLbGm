package com.calculadora_poligames;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class VolumenEsferaActivity extends AppCompatActivity {

    private EditText editTextX;
    private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumen_esfera);
        editTextX = findViewById(R.id.editTextNumberX );
        editTextTotal = findViewById(R.id.editTextNumberTotal );
        editTextX.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if( !hasFocus )
                {
                    realizaOperacion();
                }
            }
        });
    }

    @SuppressLint("DefaultLocale")
    private void realizaOperacion() {
        float radio = Float.parseFloat(editTextX.getText().toString());
        float total = (float) (((4) * (Math.pow(radio, 3)) * (Math.PI))/3);
        String resultado= Float.toString(total);
        editTextTotal.setText(resultado, TextView.BufferType.SPANNABLE );
        editTextTotal.setEnabled( false );
    }
}