package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LogoActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private CheckBox rememberPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
         editText1 = findViewById(R.id.et_3);
         editText2 = findViewById(R.id.et_4);
        Button button = findViewById(R.id.btn_5);
        rememberPass = findViewById(R.id.cb_1);
        OnClick onClick = new OnClick();
        button.setOnClickListener(onClick);
        editText1.addTextChangedListener(mTextWatcher);
        editText2.addTextChangedListener(mTextWatcher);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isRemember = pref.getBoolean("remember_password",false);
        if(isRemember){
            //将账号和密码都设置到文本框中；
            String account = pref.getString("account","");
            String password = pref.getString("password","");
            editText1.setText(account);
            editText2.setText(password);
            rememberPass.setChecked(true);
        }

    }

    public class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            String account = editText1.getText().toString();
            String password = editText2.getText().toString();

            if(account.equals("haerxiluo")&&password.equals("123456")){

                editor = pref.edit();
                if(rememberPass.isChecked()){
                    editor.putBoolean("remeber_password",true);
                    editor.putString("account",account);
                    editor.putString("password",password);
                }else{
                    editor.clear();
                }
                editor.apply();
                intent = new Intent(LogoActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }else{
                Toast.makeText(LogoActivity.this,"account or password is invalid",Toast.LENGTH_SHORT).show();
            }
        }

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
            if(s.length()>10){
                Toast.makeText(LogoActivity.this,"错误，超出最大密码或用户名长度",Toast.LENGTH_SHORT).show();
                s.clear();
            }
        }
    };
}
