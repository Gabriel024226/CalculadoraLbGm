package com.calculadora_poligames;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LibrasGramosActivity extends AppCompatActivity {

    private EditText editTextX;
    private EditText editTextTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libras_gramos);
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
        float libras = Float.parseFloat(editTextX.getText().toString());
        float gramos = (float) ((453.592)*(libras));
        String resultado = Float.toString(gramos);
        editTextTotal.setText(resultado, TextView.BufferType.SPANNABLE );
        editTextTotal.setEnabled(false);
    }
}