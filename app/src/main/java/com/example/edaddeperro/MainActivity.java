package com.example.edaddeperro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edadedit = findViewById(R.id.edad);
        TextView resultexto = findViewById(R.id.resultado_text);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edadedit.getText().toString();

               if (!edad.isEmpty())
               {
                   int edadint = Integer.parseInt(edad);
                   int resultado = edadint * 7;
                   String resultadostring = "La edad de tu peludo es: "+ resultado + "años";
                   resultexto.setText(resultadostring);
               }
            }
        });
    }
}

