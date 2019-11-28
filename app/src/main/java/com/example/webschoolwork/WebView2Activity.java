package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebView2Activity extends AppCompatActivity {

    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2);
        webView2 = findViewById(R.id.wv_2);
        webView2.loadUrl("http://tieba.baidu.com/p/5965781169?fr=ala0&pstaala=2&tpl=5&fid=3418110");
    }
}
