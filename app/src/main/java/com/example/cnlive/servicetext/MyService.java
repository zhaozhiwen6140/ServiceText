package com.example.cnlive.servicetext;


import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by CNLive on 2016/2/24.
 */
public class MyService extends IntentService{

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.e("MyService", String.valueOf(Thread.currentThread().getId()));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("My","stop");

    }
}

