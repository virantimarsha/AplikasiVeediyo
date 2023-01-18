
package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.VideoBlack;

public class Blacka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blacka);
        LinearLayout TrailerBlacka = (LinearLayout)findViewById(R.id.trailer_blacka);
        TrailerBlacka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Blacka.this, VideoBlack.class));
            }
        });
    }
}