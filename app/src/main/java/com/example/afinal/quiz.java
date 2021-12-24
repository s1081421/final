package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class quiz extends AppCompatActivity {
    private TextView question;
    private Button option1Btn,option2Btn,option3Btn,option4Btn;
    private ArrayList<Question>questionlist;
    Random random;
    int score=0,currentpos,questionAttempted=0;
    boolean []flag=new boolean[13];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        for(int i=0;i<13;i++){
            flag[i]=false;
        }

        Intent intent=getIntent();
        question=findViewById(R.id.text_Qeustion);
        option1Btn=findViewById(R.id.button_option1);
        option2Btn=findViewById(R.id.button_option2);
        option3Btn=findViewById(R.id.button_option3);
        option4Btn=findViewById(R.id.button_option4);
        questionlist=new ArrayList<>();
        random=new Random();
        getQuizQeustion(questionlist);
        currentpos=random.nextInt(questionlist.size());
        flag[currentpos]=true;
        setDatatoView(currentpos);
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionlist.get(currentpos).getAnswer()==option1Btn.getText().toString())
                    score+=10;
                do {
                currentpos=random.nextInt(questionlist.size());
                }
                while(flag[currentpos]);
                flag[currentpos]=true;
                questionAttempted++;
                setDatatoView(currentpos);
            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionlist.get(currentpos).getAnswer()==option2Btn.getText().toString())
                    score+=10;
                do {
                    currentpos=random.nextInt(questionlist.size());}while(flag[currentpos]);
                flag[currentpos]=true;
                questionAttempted++;
                setDatatoView(currentpos);
            }
        });
        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionlist.get(currentpos).getAnswer()==option3Btn.getText().toString())
                    score+=10;
                do {
                    currentpos=random.nextInt(questionlist.size());}while(flag[currentpos]);
                flag[currentpos]=true;
                questionAttempted++;
                setDatatoView(currentpos);
            }
        });
        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionlist.get(currentpos).getAnswer()==option4Btn.getText().toString())
                    score+=10;
                do {
                    currentpos=random.nextInt(questionlist.size());}while(flag[currentpos]);
                flag[currentpos]=true;
                questionAttempted++;
                setDatatoView(currentpos);
            }
        });
    }

    private void setDatatoView(int currentpos) {
        if(questionAttempted==10)
        {
            Intent intent=new Intent(quiz.this,Score.class);
            intent.putExtra("Score",score);
            quiz.this.startActivity(intent); }
        else{
        question.setText(questionlist.get(currentpos).getQuestion());
        option1Btn.setText(questionlist.get(currentpos).getOption1());
        option2Btn.setText(questionlist.get(currentpos).getOption2());
        option3Btn.setText(questionlist.get(currentpos).getOption3());
        option4Btn.setText(questionlist.get(currentpos).getOption4());}

    }

    private void getQuizQeustion(ArrayList<Question> questionlist) {
        questionlist.add(new Question("關於 Approximate computing 的敘述何者符合?",
                "透過少量計算技術算出近似結果",
                "近似電路的硬體成本較大",
                "k-means clustering 演算法 接受5%準確度損失50倍能量節約",
                "近似關鍵數據是可以被接受的",
                "k-means clustering 演算法 接受5%準確度損失50倍能量節約"));
        questionlist.add(new Question("關於 Data mining 的敘述何者為非",
                " 從資料中提取隱含價值的潛在資訊",
                "Data mining屬於機器學習的內容",
                "使用到巨量資料",
                "涉及7種常見任務",
                "涉及7種常見任務"));
        questionlist.add(new Question("Data mining 常見任務何者為非",
                "異常檢查",
                "資料整合",
                "匯總",
                "回歸",
                "資料整合"));
        questionlist.add(new Question("關於 Decision support system 何者是尚未應用的",
                "風險評估",
                "鐵路系統",
                "森林管理",
                "太空旅遊",
                "太空旅遊"));
        questionlist.add(new Question("Decision support system 的核心價值為何",
                "幫助非結構或是半結構化問題做出決策",
                "預測潛在問題",
                "管理全自動化",
                "犧牲靈活性以提高適應性",
                "幫助非結構或是半結構化問題做出決策"));
        questionlist.add(new Question("關於Phylogenetics 的敘述何者為非",
                "Phylogenetics tree的尖端可以是活的分類群或是化石",
                "Phylogenetics tree經常被用於基因拷貝和個體生物之關係",
                "迄今為止最老的DNA序列是猛犸象",
                "Phenetics在21世紀流行被廣泛運用",
                "Phenetics在21世紀流行被廣泛運用"));
        questionlist.add(new Question("常用於推斷phylogenetic inference的方法何者為非",
                "實現最優標準性",
                "簡約方法",
                "表行分類",
                "最大似然(ML)",
                "表行分類"));
        questionlist.add(new Question("何者不是NP-Hard問題",
                "Integer programming",
                "Phylogenetics",
                "Decision support system",
                "Data mining",
                "Integer programming"));
        questionlist.add(new Question("何者不是NP-Complete問題",
                "Integer programming",
                "Phylogenetics",
                "Set packing",
                "Knapsack problem",
                "Phylogenetics"));
        questionlist.add(new Question("關於 Integer programming的敘述何者正確",
                "為NP-Hard問題",
                "所有變量涵蓋整個實數",
                "被用於線性規劃",
                "不包含於Karp的21個NP-Complete",
                "被用於線性規劃"));
        questionlist.add(new Question("關於 Set packing的敘述何者為非",
                "最優化問題中找到一個使用最少集合的集合包裝",
                "可被描述為整數線性規劃",
                "能在多項式時間內完成",
                "屬於NP-Complete問題",
                "最優化問題中找到一個使用最少集合的集合包裝"));
        questionlist.add(new Question("關於 Set cover problem的敘述何者為非",
                "是經典的組合數學,計算機科學,運籌學,何複雜性理論",
                "集合覆蓋的最優化版本是NP-Complete問題",
                "是一種近似算法",
                "任務是找到使用最少集合的集合覆蓋",
                "集合覆蓋的最優化版本是NP-Complete問題"));
        questionlist.add(new Question("Knapsack problem中動態規劃需完成任務何者錯誤",
                "求最小問題的解",
                "透過最小問題的解來建構問題解公式",
                "創建表來儲存子問題的解",
                "子問題的解加總即為建構問題公式",
                "子問題的解加總即為建構問題公式"));
    }
}