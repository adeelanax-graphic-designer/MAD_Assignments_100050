package com.adeelanaz.assignment02_intent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra("MSG");
        Toast.makeText(context, "Broadcast: " + message, Toast.LENGTH_SHORT).show();
    }
}