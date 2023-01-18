package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.ReviewTranformer;
import com.example.bottomnavigation.VideoTransformer;

public class TransformerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformer);
        LinearLayout TrailerTransformer = (LinearLayout)findViewById(R.id.trailer_transformer);
        TrailerTransformer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TransformerActivity.this, VideoTransformer.class));
            }
        });
    }
}