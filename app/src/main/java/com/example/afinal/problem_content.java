package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class problem_content extends AppCompatActivity {
    String[] detail;
    TextView detail_text;
    TextView question_title;
    String text="";
    int pos;
    boolean type;
    String[][] title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_content);
        Intent intent=getIntent();
        detail=intent.getStringArrayExtra("information");
        pos=intent.getIntExtra("pos",0);
        type=intent.getBooleanExtra("type",false);
        if(type){
            title=Database.np_hard_qustion_title_list;
        }else{
            title=Database.np_complete_qustion_title_list;
        }
        detail_text=findViewById(R.id.detail_text);
        question_title =findViewById(R.id.problem);
        question_title.setText(intent.getStringExtra("title"));

        for (int i=0;i<detail.length;i++){
            if(i!=0){
                text+="\n\n";
            }
            text+=title[pos][i];

            text+="\n\n";
            text+=detail[i];
        }
        detail_text.setText(text);
        detail_text.setMovementMethod(new ScrollingMovementMethod());
    }
}