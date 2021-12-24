package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class problem_content extends AppCompatActivity {
    String[] detail;
    TextView detail_text;
    TextView question_title;
    String text="";
    Button translate;
    Button Return;
    ImageView doge;
    Boolean doge_turn =true;
    int doge_count=0;
    boolean CE_translate=true;
    int pos;
    boolean type;
    String[][] title;
    String[] link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_content);

        Intent intent=getIntent();
        doge=findViewById(R.id.imageView);
        translate=findViewById(R.id.button_translate);
        Return=findViewById(R.id.button_return);
        detail=intent.getStringArrayExtra("information");
        pos=intent.getIntExtra("pos",0);
        type=intent.getBooleanExtra("type",false);
        if(type){
            title=Database.np_hard_qustion_title_list;
            link=Database.np_hard_link;
        }else{
            title=Database.np_complete_qustion_title_list;
            link=Database.np_complete_link;
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
        translate.setOnClickListener(Translate);
        Return.setOnClickListener(returnn);
        // set up wiki link
        TextView link_text=findViewById(R.id.link);
        link_text.setText(Html.fromHtml(link[pos]));
        link_text.setMovementMethod(LinkMovementMethod.getInstance());

        //doge 更換
        doge.setOnClickListener(strong);
        doge.setOnLongClickListener(bread);


    }

    public View.OnClickListener Translate=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (CE_translate==true) {
                int pos2 = pos;
                if (!type) {
                    if (pos2 == 0) {
                        String[] data=Database.integer_programing_detail_chinese;
                        String detal="";
                        for (int i =0;i<data.length;i++){
                            detal+=data[i];
                        }
                        detail_text.setText(detal);
                    }
                    if (pos2 == 1) {
                        String[] data=Database.Set_packing_detail_chinese;
                        String detal="";
                        for (int i =0;i<data.length;i++){
                            detal+=data[i];
                        }
                        detail_text.setText(detal);
                    }
                    if (pos2 == 2) {
                        String[] data=Database.Set_cover_problem_detail_chinese;
                        String detal="";
                        for (int i =0;i<data.length;i++){
                            detal+=data[i];
                        }
                        detail_text.setText(detal);
                    }
                    if (pos2 == 3) {
                        String[] data=Database.Knapsack_problem_detail_chinese;
                        String detal="";
                        for (int i =0;i<data.length;i++){
                            detal+=data[i];
                        }
                        detail_text.setText(detal);
                    }
                } else {
                    if (pos2 == 0) {
                        String[] data = Database.Approximate_computing_detail_chinese;
                        String detal = "";
                        for (int i = 0; i < data.length; i++) {
                            detal += data[i];
                        }
                        detail_text.setText(detal);
                    }
                    if (pos2 == 1) {
                        String[] data = Database.Data_mining_detail_chinese;
                        String detal = "";
                        for (int i = 0; i < data.length; i++) {
                            detal += data[i];
                        }
                        detail_text.setText(detal);
                    }
                    if (pos2 == 2) {
                        String[] data = Database.Decision_support_system_detail_chinese;
                        String detal = "";
                        for (int i = 0; i < data.length; i++) {
                            detal += data[i];
                        }
                        detail_text.setText(detal);
                    }
                    if (pos2 == 3) {
                        String[] data = Database.Phylogenetics_detail_chinese;
                        String detal = "";
                        for (int i = 0; i < data.length; i++) {
                            detal += data[i];
                        }
                        detail_text.setText(detal);
                    }
                }

                CE_translate=false;
            }
            else{
                detail_text.setText(text);
                detail_text.setMovementMethod(new ScrollingMovementMethod());
                CE_translate=true;
            }
            detail_text.scrollTo(0,0);
        }
    };
    public View.OnClickListener returnn=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass( problem_content.this, MainActivity.class );
            startActivity(intent);
        }
    };
    public View.OnClickListener strong=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(doge_turn==true){
            doge.setImageResource(R.drawable.doge_strong);
            doge_turn=false; }
            else{
                doge.setImageResource(R.drawable.doge);
                doge_turn=true; }
            doge_count++;
            if(doge_count>10)
                doge.setImageResource(R.drawable.doge_full);
        }
    };
   public View.OnLongClickListener bread=new View.OnLongClickListener() {
       @Override
       public boolean onLongClick(View view) {
           doge.setImageResource(R.drawable.doge_bread);
           return false;
       }
   };
}