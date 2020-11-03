package com.jacky.launcher.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent launcherIntent = new Intent(context, MainActivity.class);
        context.startActivity(launcherIntent);
    }
}
