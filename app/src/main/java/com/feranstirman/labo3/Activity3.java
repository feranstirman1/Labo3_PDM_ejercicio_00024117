package com.feranstirman.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private TextView tvShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        tvShare = findViewById(R.id.tv_share);
        Intent mIntent = this.getIntent();
        if(mIntent!=null){
            tvShare.setText("se ha llegado a la tercera actividad exitosamente");
        }
    }
}
