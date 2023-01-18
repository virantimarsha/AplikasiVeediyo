package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.VideoThebig4;
import com.example.bottomnavigation.VideoTransformer;

public class Thebig4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thebig4);
        LinearLayout TrailerBig4 = (LinearLayout)findViewById(R.id.trailer_big4);
        TrailerBig4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Thebig4.this, VideoThebig4.class));
            }
        });
    }
}