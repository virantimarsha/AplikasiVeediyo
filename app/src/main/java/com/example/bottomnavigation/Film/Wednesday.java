package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.VideoTransformer;
import com.example.bottomnavigation.VideoWednesday;

public class Wednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);
        LinearLayout TrailerWednesday = (LinearLayout)findViewById(R.id.trailer_wednesday);
        TrailerWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Wednesday.this, VideoWednesday.class));
            }
        });
    }
}