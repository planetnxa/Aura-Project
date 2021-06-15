package com.example.auraia.SETTINGS;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.auraia.Dimming.ScreenFIlterService;

public class dimmerOffReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, ScreenFIlterService.class);
        if (ScreenFIlterService.STATE==ScreenFIlterService.STATE_ACTIVE){
            context.stopService(i);
        }
    }
}

