package com.devbiku.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        c1 = findViewById(R.id.kg_to_pound);
        c2 = findViewById(R.id.meter_to_feet);
        c3 = findViewById(R.id.feet_to_inch);
        c4 = findViewById(R.id.celsius_to_fahrenheit);
        c5 = findViewById(R.id.celsius_to_kelvin);
        c6 = findViewById(R.id.fahrenheit_to_kelvin);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this , KgToPound.class);
                startActivity(i1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this, MeterToFeet.class);
                startActivity(i2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this, FeetToInch.class);
                startActivity(i3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MainActivity.this, CelsiusToFahrenheit.class);
                startActivity(i4);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(MainActivity.this, CelsiusToKelvin.class);
                startActivity(i5);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(MainActivity.this, FahrenheitToKelvin.class);
                startActivity(i6);
            }
        });
    }
}