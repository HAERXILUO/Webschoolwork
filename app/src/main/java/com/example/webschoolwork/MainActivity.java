package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        tv = findViewById(R.id.tv_1);
        OnClick onClick = new OnClick();
        btn1.setOnClickListener(onClick);
        btn2.setOnClickListener(onClick);
        btn3.setOnClickListener(onClick);
        tv.setOnClickListener(onClick);

    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_1:
                    intent = new Intent(MainActivity.this,LogoActivity.class);
                    break;
                case R.id.btn_2:
                    Toast.makeText(getApplicationContext(),"转至sina微博界面",Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this,WebViewActivity1.class);
                    break;
                case R.id.btn_3:
                    intent = new Intent(MainActivity.this,WebView2Activity.class);
                    break;
                case R.id.tv_1:
                    intent = new Intent(MainActivity.this,RegisterActivity.class);
                    break;
            }

            startActivity(intent);
        }
    }
}
