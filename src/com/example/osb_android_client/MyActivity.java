package com.example.osb_android_client;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
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
                Uri.parse("http://213.5.44.189:"+port+"/obp/simple/view"));
        startActivity(viewIntent);
    }

    public void selectRemoteTrimSlice1(View view) {
        browseSelectedPort(8082);
    }

    public void selectRemoteTrimSlice2(View view) {
        browseSelectedPort(8084);
    }

    public void selectRemoteLaptop(View view) {
        browseSelectedPort(8086);
    }

}
