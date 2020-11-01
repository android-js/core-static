package com.android.js.staticsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.webkit.WebView;

import com.android.js.other.PermissionRequest;

public class MainActivity extends AndroidJSActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // check and request for required permission
        System.out.println(Environment.getRootDirectory());
        PermissionRequest.checkAndAskForPermissions(this, this);

        // webview

        this.myWebView = (WebView) findViewById(R.id.webview);

        configureWebview(R.mipmap.ic_launcher);
    }
}