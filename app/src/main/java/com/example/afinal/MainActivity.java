package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CustomAdapter np_complete_adapter;
    RecyclerView np_complete_recyclerView;
    String [] np_complete_title_list;
    String [][] np_complete_list;
    CustomAdapter2 np_hard_adapter2;
    RecyclerView np_hard_recyclerView2;
    String [] np_hard_title_list;
    String [][] np_hard_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get np_complete_list
        np_complete_title_list=Database.np_complete_qustion_list;
        np_complete_list=Database.np_complete_qustion_title_list;
        np_complete_adapter=new CustomAdapter(np_complete_title_list,np_complete_list);
        np_complete_recyclerView=findViewById(R.id.np_complete);
        np_complete_recyclerView.setHasFixedSize(true);
        np_complete_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        np_complete_recyclerView.setAdapter(np_complete_adapter);
        //get np_hard_list
        np_hard_title_list=Database.np_hard_qustion_list;
        np_hard_list=Database.np_hard_qustion_title_list;
        np_hard_adapter2=new CustomAdapter2(np_hard_title_list,np_hard_list);
        np_hard_recyclerView2=findViewById(R.id.np_hard);
        np_hard_recyclerView2.setHasFixedSize(true);
        np_hard_recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        np_hard_recyclerView2.setAdapter(np_hard_adapter2);

    }
    public static void onColorItemSelected(Context activity, String[]link,String title,int pos,boolean type) {
        Intent intent=new Intent(activity,problem_content.class);
        intent.putExtra("information",link);
        intent.putExtra("title",title);
        intent.putExtra("pos",pos);
        intent.putExtra("type",type);
        activity.startActivity(intent);
    }

}