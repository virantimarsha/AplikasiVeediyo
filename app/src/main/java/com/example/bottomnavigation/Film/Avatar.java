package com.example.bottomnavigation.Film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.ReviewAvatar;
import com.example.bottomnavigation.VideoAvatar;

public class Avatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);

        LinearLayout TrailerAvatar = (LinearLayout)findViewById(R.id.trailer_avatar);
        TrailerAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Avatar.this, VideoAvatar.class));
            }
        });
    }
}