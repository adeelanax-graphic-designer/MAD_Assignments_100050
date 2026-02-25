package com.adeelanaz.assignment02_intent;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

    public class SecondActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Create a simple text view to show the result
            TextView textView = new TextView(this);

            // Retrieve the EXTRA sent from MainActivity
            String data = getIntent().getStringExtra("KEY_DATA");

            textView.setText("Received Data: " + data);
            textView.setTextSize(24);
            setContentView(textView);
        }
    }

