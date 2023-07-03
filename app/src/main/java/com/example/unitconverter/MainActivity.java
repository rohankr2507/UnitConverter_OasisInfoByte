package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView result;

    Button reset, Km_m, m_Km, C_F, F_C, Kg_gm, gm_Kg, hr_min, min_s, min_hr, s_hr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input_units);
        result = findViewById(R.id.result);
        reset = findViewById(R.id.reset);
        Km_m = findViewById(R.id.km_m);
        m_Km = findViewById(R.id.m_km);
        C_F = findViewById(R.id.C_F);
        F_C = findViewById(R.id.F_C);
        Kg_gm = findViewById(R.id.Kg_gm);
        gm_Kg = findViewById(R.id.gm_Kg);
        hr_min = findViewById(R.id.hr_min);
        min_s = findViewById(R.id.min_s);
        min_hr = findViewById(R.id.min_hr);
        s_hr = findViewById(R.id.s_hr);

        Toast.makeText(this, "App Started", Toast.LENGTH_SHORT).show();

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                result.setText("");
            }
        });

        Km_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + 1000 * temp + " Km");
                }
            }
        });

        m_Km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + temp / 1000 + " m");
                }
            }
        });

        C_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + (temp * 1.8 + 32) + " \u2109");
                }
            }
        });

        F_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + (0.55 * (temp - 32)) + " \u2103");
                }
            }
        });

        Kg_gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + temp * 1000 + " Kg");
                }
            }
        });

        gm_Kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + temp / 1000 + " gm");
                }
            }
        });

        hr_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + temp * 60 + " min");
                }
            }
        });

        min_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + temp * 60 + " sec");
                }
            }
        });

        min_hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + temp / 60 + " hr");
                }
            }
        });

        s_hr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Input Value First", Toast.LENGTH_SHORT).show();
                } else {
                    double temp = Double.parseDouble(input.getText().toString());
                    result.setText("Result is : " + temp / 3600 + " hr");
                }
            }
        });

    }
}