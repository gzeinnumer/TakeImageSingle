package com.gzeinnumer.takeimagesingle;

import android.app.Application;

import com.gzeinnumer.eeda.helper.FGDir;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        String externalFolderName = getApplicationContext().getString(R.string.app_name); //MyLibsTesting

        //type 1
        FGDir.initExternalDirectoryName(externalFolderName);
    }
}
