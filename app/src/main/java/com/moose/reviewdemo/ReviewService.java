package com.moose.reviewdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ReviewService extends Service {
    public ReviewService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
