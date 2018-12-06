package com.wajahatkarim3.applinks_demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = findViewById(R.id.txtHello);

        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();

        if (appLinkData != null)
        {
            txtHello.setText(
                    "URI: " + appLinkData.toString() + "\n\n" +
                    "Action: " + appLinkAction.toString() + "\n\n" +
                    "Encoded Path: " + appLinkData.getEncodedPath() + "\n\n" +
                    "Query: " + appLinkData.getEncodedQuery() + "\n\n" +
                    "Query Action: " + appLinkData.getQueryParameter(".a") + "\n\n" +
                    "Mode: " + appLinkData.getQueryParameter("mode") + "\n\n" +
                    "User ID: " + appLinkData.getQueryParameter("id") + "\n\n" +
                    "Activation Confirm: " + appLinkData.getQueryParameter("ActivationConfirm") + "\n\n"
             );
        }

        int a =0;
        a++;
        a++;
        a++;
    }
}
