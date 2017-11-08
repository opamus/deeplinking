package com.example.olli.deeplinktest3;

import android.app.Application;
import io.branch.referral.Branch;

/**
 * Created by Olli on 07/11/2017.
 */

public class CustomApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Branch.enableLogging();
        Branch.getAutoInstance(this);
    }
}
