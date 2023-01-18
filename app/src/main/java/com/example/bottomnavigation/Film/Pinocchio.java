package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.VideoPinocchio;
import com.example.bottomnavigation.VideoTransformer;

public class Pinocchio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinocchio);
        LinearLayout TrailerPino = (LinearLayout)findViewById(R.id.trailer_pino);
        TrailerPino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pinocchio.this, VideoPinocchio.class));
            }
        });
    }
}