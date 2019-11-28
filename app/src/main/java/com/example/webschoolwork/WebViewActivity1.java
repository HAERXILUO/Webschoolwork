package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity1 extends AppCompatActivity {

    private WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);
        webView1 = findViewById(R.id.wv_1);
        webView1.loadUrl("https://weibo.com/?sudaref=www.baidu.com&display=0&retcode=6102");

    }
}
