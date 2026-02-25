package com.adeelanaz.assignment02_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Activity to Activity (Using Extra & Flag)
        findViewById(R.id.btnActivity).setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("KEY_DATA", "Hello from Main!"); // Extra
            i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT); // Flag
            startActivity(i);
        });

        // 2. Activity to Service
        findViewById(R.id.btnService).setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MyService.class);
            startService(i);
            Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        });

        // 3. Activity to System App (Using Action, Data, Category)
        findViewById(R.id.btnSystem).setOnClickListener(v -> {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL); // Action
            i.setData(Uri.parse("tel:03001234567")); // Data
            i.addCategory(Intent.CATEGORY_DEFAULT); // Category
            startActivity(i);
        });

        // 4. Activity to Other App (Implicit Intent)
        findViewById(R.id.btnOtherApp).setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "Sending this to another app!");
            startActivity(Intent.createChooser(i, "Share via"));
        });

        // 5. Activity to Broadcast
        findViewById(R.id.btnBroadcast).setOnClickListener(v -> {
            Intent i = new Intent("com.example.MY_NOTIFICATION");
            i.putExtra("MSG", "Broadcast Received Successfully!");
            sendBroadcast(i);
        });
    }
}