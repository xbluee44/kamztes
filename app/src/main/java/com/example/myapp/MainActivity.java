package com.example.myapp;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.*;
public class MainActivity extends Activity {
    private WebView wv;
    @Override protected void onCreate(Bundle s){
        super.onCreate(s);setContentView(R.layout.activity_main);
        wv=findViewById(R.id.webView);
        WebSettings ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);ws.setDomStorageEnabled(true);
        ws.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        ws.setAllowFileAccess(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed(){if(wv.canGoBack())wv.goBack();else super.onBackPressed();}
}