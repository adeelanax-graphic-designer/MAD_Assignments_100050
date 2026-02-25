package com.adeelanaz.assignment02_intent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service is running in background", Toast.LENGTH_LONG).show();
        return START_NOT_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent) { return null; }
}