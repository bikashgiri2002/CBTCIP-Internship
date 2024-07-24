package com.devbiku.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FahrenheitToKelvin extends AppCompatActivity {
    Button calculate;
    EditText inputText;
    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fahrenheite_to_kelvin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        calculate = findViewById(R.id.btn_calculate);
        inputText = findViewById(R.id.input);
        outputText = findViewById(R.id.output);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input = Double.parseDouble(String.valueOf(inputText.getText()));
                double output = (input - 32) * 5/9 + 273.15 ;
                outputText.setText(input+" Fahrenheit is "+String.valueOf(output)+" Kelvin");
            }
        });
    }
}