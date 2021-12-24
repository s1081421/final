package com.example.afinal;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //設定此介面為
        // 豎屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        init();
    }

    private void init() {

        //利用timer讓此介面延遲3秒後跳轉，timer有一個執行緒，該執行緒不斷執行task
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //傳送intent實現頁面跳轉，第一個引數為當前頁面的context，第二個引數為要跳轉的主頁
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                //跳轉後關閉當前歡迎頁面
                SplashActivity.this.finish();
            }
        };
        //排程執行timerTask，第二個引數傳入延遲時間（毫秒）
        timer.schedule(timerTask,3000);
    }
}