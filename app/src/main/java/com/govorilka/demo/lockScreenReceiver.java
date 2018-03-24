package com.govorilka.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
// https://github.com/Joisar/LockScreenApp
public class lockScreenReceiver extends BroadcastReceiver {
    // Handle actions and display Lockscreen
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)
                || intent.getAction().equals(Intent.ACTION_SCREEN_ON)
                || intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            start_lockscreen(context);
        }
    }

    // Display lock screen
    private void start_lockscreen(Context context) {
        Intent mIntent = new Intent(context, GovorilkaActivity.class);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mIntent);
    }
}
