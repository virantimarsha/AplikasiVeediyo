package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.VideoAlice;
import com.example.bottomnavigation.VideoTransformer;

public class Alice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alice);
        LinearLayout TrailerAlice = (LinearLayout)findViewById(R.id.trailer_alice);
        TrailerAlice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Alice.this, VideoAlice.class));
            }
        });
    }
}