package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bottomnavigation.Film.Alice;
import com.example.bottomnavigation.Film.Avatar;
import com.example.bottomnavigation.Film.Blacka;
import com.example.bottomnavigation.Film.BlackpActivity;
import com.example.bottomnavigation.Film.Chainsawman;
import com.example.bottomnavigation.Film.Mario;
import com.example.bottomnavigation.Film.Pinocchio;
import com.example.bottomnavigation.Film.Thebig4;
import com.example.bottomnavigation.Film.TransformerActivity;
import com.example.bottomnavigation.Film.Wednesday;
import com.example.bottomnavigation.Fragment.FragmentAbout;
import com.example.bottomnavigation.Fragment.FragmentReview;
import com.example.bottomnavigation.Fragment.FragmentHome;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();
    BottomNavigationView bottomNavigationView;
    private DBHandler dbHandler;


    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new FragmentHome();
                    break;
                case R.id.menu_favorite:
                    f = new FragmentReview();
                    break;
                case R.id.menu_about:
                    f = new FragmentAbout();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHandler = new DBHandler(MainActivity.this);

        LinearLayout btnAvatar = (LinearLayout) findViewById(R.id.avatar);
        btnAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Avatar.class));
            }
        });

        LinearLayout btnTransformer = (LinearLayout) findViewById(R.id.transformer);
        btnTransformer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TransformerActivity.class));
            }
        });

        LinearLayout btnBlackPanther = (LinearLayout) findViewById(R.id.blackpanther);
        btnBlackPanther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BlackpActivity.class));
            }
        });

        LinearLayout btnBlackAdam = (LinearLayout) findViewById(R.id.blackadam);
        btnBlackAdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Blacka.class));
            }
        });

        LinearLayout btnWednesday = (LinearLayout) findViewById(R.id.wednesday);
        btnWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Wednesday.class));
            }
        });

        LinearLayout btnPinocchio = (LinearLayout) findViewById(R.id.pinocchio);
        btnPinocchio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Pinocchio.class));
            }
        });

        LinearLayout btnBig4 = (LinearLayout) findViewById(R.id.thebig4);
        btnBig4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Thebig4.class));
            }
        });

        LinearLayout btnAlice = (LinearLayout) findViewById(R.id.alice);
        btnAlice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Alice.class));
            }
        });

        LinearLayout btnChainsawman = (LinearLayout) findViewById(R.id.chainsaw);
        btnChainsawman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Chainsawman.class));
            }
        });

        LinearLayout btnMario = (LinearLayout) findViewById(R.id.mariobros);
        btnMario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Mario.class));
            }
        });

        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);

        viewPager2 = findViewById(R.id.slider);

        List<SliderItem> sliderItems = new ArrayList<>();

        sliderItems.add(new SliderItem(R.drawable.image1));
        sliderItems.add(new SliderItem(R.drawable.transformer));
        sliderItems.add(new SliderItem(R.drawable.blackpanther));
        sliderItems.add(new SliderItem(R.drawable.blackadam));
        sliderItems.add(new SliderItem(R.drawable.wednesday));
        sliderItems.add(new SliderItem(R.drawable.thebig4));
        sliderItems.add(new SliderItem(R.drawable.pinocchio));
        sliderItems.add(new SliderItem(R.drawable.alice));
        sliderItems.add(new SliderItem(R.drawable.chainsawman));
        sliderItems.add(new SliderItem(R.drawable.mario));

        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 3000);
            }
        });
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);

        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 3000);
    }
}