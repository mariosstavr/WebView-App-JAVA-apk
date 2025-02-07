package com.example.mywebsite;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyShortcutReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.example.mywebsite.SHORTCUT".equals(action)) {
            
            Toast.makeText(context, "Shortcut clicked!", Toast.LENGTH_SHORT).show();
        }
    }
}
