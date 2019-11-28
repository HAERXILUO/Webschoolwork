package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText editText = findViewById(R.id.et_1);
        EditText editText1 = findViewById(R.id.et_2);
        editText.addTextChangedListener(mTextWatcher);
        editText1.addTextChangedListener(mTextWatcher);
    }

    private final TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
                if(s.length()>15){
                    Toast.makeText(RegisterActivity.this,"错误，超出最大密码或用户名长度",Toast.LENGTH_SHORT).show();
                    s.clear();
                }
        }
    };

}
