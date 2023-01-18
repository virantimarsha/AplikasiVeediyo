package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.VideoBlackp;
import com.example.bottomnavigation.VideoTransformer;

public class BlackpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackp);
        LinearLayout TrailerBlackp = (LinearLayout)findViewById(R.id.trailer_blackp);
        TrailerBlackp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BlackpActivity.this, VideoBlackp.class));
            }
        });
    }
}