package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Score extends AppCompatActivity {
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent=getIntent();

        TextView text_score=findViewById(R.id.text_score);
        Button restart= findViewById(R.id.button_restart);
        Button Return=findViewById(R.id.button_return2);
        ImageView doge=findViewById(R.id.image_score_doge);
        score=intent.getIntExtra("Score",0);
        text_score.setText(String.valueOf(score));

        if(score<=20)doge.setImageResource(R.drawable.doge_cry);
        else if(score<=40)doge.setImageResource(R.drawable.doge);
        else if(score<=60)doge.setImageResource(R.drawable.doge_bread);
        else if(score<=80)doge.setImageResource(R.drawable.doge_strong);
        else if(score<100)doge.setImageResource(R.drawable.doge_full);
        else doge.setImageResource(R.drawable.doge_buff);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( Score.this, quiz.class );
                startActivity(intent);
            }
        });
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass( Score.this, MainActivity.class );
                startActivity(intent);
            }
        });

    }
}