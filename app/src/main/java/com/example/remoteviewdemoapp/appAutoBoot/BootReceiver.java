package com.example.remoteviewdemoapp.appAutoBoot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.remoteviewdemoapp.MainActivity;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {

            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            context.startActivity(i);

        }
    }
}