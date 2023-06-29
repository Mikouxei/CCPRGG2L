package com.maxi.finalproject;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class Notification extends Application {

    public static final String Notification_Channel = "Report Channel";

    @Override
    public void onCreate() {
        super.onCreate();

        createNotification();
    }

    private void createNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel report_channel = new NotificationChannel(
                    Notification_Channel,
                    "Report Channel",
                    NotificationManager.IMPORTANCE_HIGH
            );
            report_channel.setDescription("This is report channel");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(report_channel);
        }
    }

}
