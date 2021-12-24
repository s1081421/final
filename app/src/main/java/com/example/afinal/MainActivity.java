package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    CustomAdapter np_complete_adapter;
    RecyclerView np_complete_recyclerView;
    String [] np_complete_title_list;


    CustomAdapter2 np_hard_adapter2;
    RecyclerView np_hard_recyclerView2;
    String [] np_hard_title_list;
    Button quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get np_complete_list
        np_complete_title_list=Database.np_complete_qustion_list;
        //set up adapter
        np_complete_adapter=new CustomAdapter(np_complete_title_list);
        //set up recyclerView
        np_complete_recyclerView=findViewById(R.id.np_complete);
        np_complete_recyclerView.setHasFixedSize(true);
        np_complete_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        np_complete_recyclerView.setAdapter(np_complete_adapter);
        //get np_hard_list
        np_hard_title_list=Database.np_hard_qustion_list;
        np_hard_adapter2=new CustomAdapter2(np_hard_title_list);
        np_hard_recyclerView2=findViewById(R.id.np_hard);
        np_hard_recyclerView2.setHasFixedSize(true);
        np_hard_recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        np_hard_recyclerView2.setAdapter(np_hard_adapter2);
        //get chinese list
        //quiz
        quiz=findViewById(R.id.button_quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,quiz.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
    public static void onColorItemSelected(Context activity, String[] link, String title, int pos, boolean type) {
        Intent intent=new Intent(activity,problem_content.class);
        intent.putExtra("information",link);
        intent.putExtra("title",title);
        intent.putExtra("pos",pos);
        intent.putExtra("type",type);
        activity.startActivity(intent);
    }

}