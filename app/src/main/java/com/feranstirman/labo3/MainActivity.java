package com.feranstirman.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.feranstirman.labo3.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private EditText etGender,etUsername,etPassword,etEmail;
    private String username,email,password,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGender = findViewById(R.id.et_gender);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        etEmail = findViewById(R.id.et_email);

        mButton = findViewById(R.id.btn_send);

        mButton.setOnClickListener(v->{

            username = etUsername.getText().toString();
            password = etPassword.getText().toString();
            email = etEmail.getText().toString();
            gender = etGender.getText().toString();

            Intent mIntent = new Intent(MainActivity.this,NewActivity.class);
            mIntent.putExtra(AppConstant.USERNAME_KEY,username);
            mIntent.putExtra(AppConstant.PASSWORD_KEY,password);
            mIntent.putExtra(AppConstant.EMAIL_KEY,email);
            mIntent.putExtra(AppConstant.GENDER_KEY,gender);
            startActivity(mIntent);

        });

    }
}
