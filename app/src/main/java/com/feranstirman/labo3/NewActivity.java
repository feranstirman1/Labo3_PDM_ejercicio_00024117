package com.feranstirman.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.feranstirman.labo3.utils.AppConstant;

public class NewActivity extends AppCompatActivity {

    private TextView tvUsername,tvPassword,tvEmail,tvGender;
    private Button btnShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        tvUsername = findViewById(R.id.tv_username);
        tvPassword = findViewById(R.id.tv_password);
        tvEmail = findViewById(R.id.tv_email);
        tvGender = findViewById(R.id.tv_gender);

        Intent mIntent = this.getIntent();
        if(mIntent!=null){
            String username,password,email,gender;
            username = mIntent.getStringExtra(AppConstant.USERNAME_KEY);
            password = mIntent.getStringExtra(AppConstant.PASSWORD_KEY);
            email = mIntent.getStringExtra(AppConstant.EMAIL_KEY);
            gender = mIntent.getStringExtra(AppConstant.GENDER_KEY);

            tvUsername.setText(username);
            tvPassword.setText(password);
            tvEmail.setText(email);
            tvGender.setText(gender);


        }

        btnShare = findViewById(R.id.btn_share);
        btnShare.setOnClickListener(v->{
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT,"");
            startActivity(shareIntent);
        });
    }
}
