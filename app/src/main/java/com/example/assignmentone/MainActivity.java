package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    EditText principal, interest, years;
    Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        principal = findViewById(R.id.principal);
        interest = findViewById(R.id.interest);
        years = findViewById(R.id.years);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = principal.getText().toString();
                String temp1 = interest.getText().toString();
                String temp2 = years.getText().toString();

                double m = (Double.parseDouble(temp2))*12;
                double p = Double.parseDouble(temp);
                double i = ((Double.parseDouble(temp1))/100)/12;

                double res = p * ((i * (Math.pow(1+i, m))) / ((Math.pow(1+i, m)) - 1));



                NumberFormat formatter = NumberFormat.getCurrencyInstance();
                String payment = formatter.format(res);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("payment", payment);
                startActivity(intent);

            }
        });
    }
}