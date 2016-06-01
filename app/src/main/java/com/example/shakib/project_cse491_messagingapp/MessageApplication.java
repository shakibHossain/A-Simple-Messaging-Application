package com.example.shakib.project_cse491_messagingapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Shakib on 31/03/2015.
 */
public class MessageApplication extends Application {

    public void onCreate(){
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "JyDMyoCDoIHnz6xZA0clvfiIoOlj0pVbCwk7Xl7Q", "rCQsv1saKYizumZzYDyd3phBBxMRxzbLgY7UY1n9");

    }

}
