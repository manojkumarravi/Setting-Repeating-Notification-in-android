package com.example.manojkumar.myapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

/**
 * Created by Manoj Kumar on 9/17/2016.
 */
public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        long when = System.currentTimeMillis();
        int id = 0;
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Intent notin = new Intent(context, SuC.class);
        notin.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent p2 = PendingIntent.getActivity(context, 0, notin, PendingIntent.FLAG_UPDATE_CURRENT);
        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder mnb = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.s1)
                .setContentTitle("NOTIFICATION")
                .setContentText("YOU HAVE SELECTED SUGARCANE")
                .setSound(alarmSound)
                .setAutoCancel(true).setWhen(when)
                .setContentIntent(p2)
                .setVibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000
                });
        nm.notify(id, mnb.build());
        id++;


    }
}
