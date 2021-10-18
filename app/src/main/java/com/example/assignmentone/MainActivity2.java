package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView result;
    String payment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle values = getIntent().getExtras();
        if(values != null){
            payment = values.getString("payment");
        }

        result = findViewById(R.id.monthPay);

        result.setText("Monthly Payment: " + payment);
    }
}
