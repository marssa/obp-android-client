package com.example.osb_android_client;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {

    public static final String remoteUriPrefix = "http://213.165.184.156";
    public static final String appStartingPath = "/obp/simple/view";
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    private void browseSelectedPort(int port) {
        Intent viewIntent = new Intent(
                "android.intent.action.VIEW",
                Uri.parse(remoteUriPrefix+":"+port+appStartingPath));
        startActivity(viewIntent);
    }

    public void selectUtilite1(View view) {
        browseSelectedPort(8082);
    }

    public void selectTrimSlice1(View view) {
        browseSelectedPort(8084);
    }

    public void selectTrimSlice2(View view) {
        browseSelectedPort(8086);
    }

    public void selectTrimSlice3(View view) {
        browseSelectedPort(8088);
    }

}
