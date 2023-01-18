package com.example.bottomnavigation.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bottomnavigation.R;
import com.example.bottomnavigation.ReviewAlice;
import com.example.bottomnavigation.ReviewAvatar;
import com.example.bottomnavigation.ReviewBig4;
import com.example.bottomnavigation.ReviewBlackAdam;
import com.example.bottomnavigation.ReviewBlackPanther;
import com.example.bottomnavigation.ReviewPinocchio;
import com.example.bottomnavigation.ReviewTranformer;
import com.example.bottomnavigation.ReviewWednesday;

public class FragmentReview extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_review, container, false);
        Button Avatar = view.findViewById(R.id.btnrv_avatar);
        Avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewAvatar.class);
                startActivity(intent);
            }
        });
        Button Transformer = view.findViewById(R.id.btnrv_transformer);
        Transformer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewTranformer.class);
                startActivity(intent);
            }
        });
        Button BlackPanther = view.findViewById(R.id.btnrv_blackp);
        BlackPanther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewBlackPanther.class);
                startActivity(intent);
            }
        });
        Button BlackAdam = view.findViewById(R.id.btnrv_blacka);
        BlackAdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewBlackAdam.class);
                startActivity(intent);
            }
        });
        Button Wednesday = view.findViewById(R.id.btnrv_wednesday);
        Wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewWednesday.class);
                startActivity(intent);
            }
        });
        Button Big4 = view.findViewById(R.id.btnrv_big4);
        Big4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewBig4.class);
                startActivity(intent);
            }
        });
        Button Pino = view.findViewById(R.id.btnrv_pino);
        Pino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewPinocchio.class);
                startActivity(intent);
            }
        });
        Button Alice = view.findViewById(R.id.btnrv_alice);
        Alice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getActivity(), ReviewAlice.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
